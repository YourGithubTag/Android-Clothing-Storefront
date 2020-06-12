package com.example.apparelmarket;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;


import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String ITEM_DETAIL_KEY = "item";

    RecyclerView itemslistview;
    TextView    searchbutton;
    ItemAdapter itemAdapter;
    ArrayList<apparelItem> apparelitems;

    RecyclerView toppicksRecycle;
    ArrayList<apparelItem> toppickarray;
    TopPicksAdapter topadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        ApparelItemProvider.generateData();

        itemAdapter = new ItemAdapter(ApparelItemProvider.apparelItemslist);
        searchbutton = (TextView) findViewById(R.id.text_top_picks);
        itemslistview = (RecyclerView) findViewById(R.id.listall);
        itemslistview.setLayoutManager(lm);
        itemslistview.setAdapter(itemAdapter);

        itemAdapter.setOnItemClickListner(new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                apparelitems.get(position).changetext1("Clicked");
                itemAdapter.notifyItemChanged(position);

                Intent intent = new Intent(MainActivity.this, item_detail.class);
                intent.putExtra(ITEM_DETAIL_KEY, apparelitems.get(position));
                startActivity(intent);
            }
        });

        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                intent.putExtra(ITEM_DETAIL_KEY, apparelitems);
                startActivity(intent);
            }
        });

        SessionClass.largestthree(ApparelItemProvider.apparelItemslist);
        toppicksRecycle = (RecyclerView) findViewById(R.id.toppicksRecycle);
        topadapter = new TopPicksAdapter(SessionClass.toppickarray);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity, menu);
        final MenuItem searchItem = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) searchItem.getActionView();

       /* SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(new ComponentName(this, SearchActivity.class)));
        searchView.setQueryHint("epic");
        return true;*/

        //this might work if we just launch an intent here!!!
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                // Reset SearchView
                searchView.clearFocus();
                searchView.setQuery("", false);
                searchView.setIconified(true);
                searchItem.collapseActionView();

                //complete SearchActivity by yourself
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                intent.putExtra(ITEM_DETAIL_KEY, query);
                startActivity(intent);

                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        SessionClass.largestthree(ApparelItemProvider.apparelItemslist);
        topadapter.notifyDataSetChanged();
    }
}
