package com.example.apparelmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.apparelmarket.models.ApparelItem;
import com.example.apparelmarket.models.ApparelProvider;
import com.example.apparelmarket.models.ItemAdapter;
import com.example.apparelmarket.models.SearchClass;
import com.synnapps.carouselview.CarouselView;


import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    public static final String ITEM_DETAIL_KEY = "item";
    ListView lvItems;
    ItemAdapter itemAdapter;

    private TextView tvItemName;
    private TextView tvItemPrice;
    private CarouselView carouselView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // ListView from activity_list.xml
        lvItems = (ListView) findViewById(R.id.lvItems);
        tvItemName = (TextView) findViewById(R.id.tvItemName);
        tvItemPrice = (TextView) findViewById(R.id.tvItemPrice);
        carouselView = (CarouselView) findViewById(R.id.carouselView);

        // Gets the intent and Query sent from MainActivity.
        Intent thisIntent = getIntent();
        String query =  thisIntent.getStringExtra(MainActivity.ITEM_DETAIL_KEY);
        // Query is used to generate the appropriate array of ApparelItems.
        ArrayList<ApparelItem> queriedItems = SearchClass.searchFunction(query, ApparelProvider.generateData());
        // Sets the adapter for ListActivity allowing for appropriate results to be displayed.
        itemAdapter = new ItemAdapter(this, queriedItems);
        lvItems.setAdapter(itemAdapter);

        // Items when clicked in ListActivity proceed to DetailsActivity if items were displayed in ListAcitivty.
        if (!(queriedItems.get(0).getId() == "null")) {
            setupItemSelectedListener();
        }
    }

    // Sends an item's data from ListActivity to DetailsActivity for further use.
    public void setupItemSelectedListener() {
        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListActivity.this, DetailsActivity.class);
                // Sending Data
                intent.putExtra(ITEM_DETAIL_KEY, itemAdapter.getItem(position));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}