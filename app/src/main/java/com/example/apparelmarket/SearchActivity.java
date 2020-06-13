package com.example.apparelmarket;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;

import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;


import java.util.ArrayList;


public class SearchActivity extends AppCompatActivity {
    ListView itemslistview;
    SearchItemAdapter searchitemAdapter;
    ArrayList<apparelItem> Searchapparelitems;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.searchactivity);


        Intent intent = getIntent();
        String query = intent.getStringExtra(MainActivity.ITEM_DETAIL_KEY);
        Searchapparelitems = Searchclass.searchFunction(query, ApparelItemProvider.apparelItemslist);
        /*if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            Searchapparelitems = Searchclass.searchFunction(query, Searchapparelitems);
        }*/

        LinearLayoutManager lm = new LinearLayoutManager(this);

        searchitemAdapter = new SearchItemAdapter(this, Searchapparelitems);
        itemslistview = (ListView) findViewById(R.id.searchview);
        itemslistview.setAdapter(searchitemAdapter);

        /*itemAdapter.setOnItemClickListner(new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(SearchActivity.this, item_detail.class);
                intent.putExtra(MainActivity.ITEM_DETAIL_KEY, Searchapparelitems.get(position));
                startActivity(intent);
            }
        });*/

        //Intent incoming = getIntent();
        // Use the book to populate the data into our views
        //apparelitems = (ArrayList<apparelItem>) incoming.getSerializableExtra(MainActivity.ITEM_DETAIL_KEY);
        //apparelitems = Searchclass.searchFunction("fortnite",apparelitems);

    }


}
