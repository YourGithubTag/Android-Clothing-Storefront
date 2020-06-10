package com.example.apparelmarket;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;


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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView itemslistview;
    ItemAdapter itemAdapter;
    RecyclerView.Adapter mAdapter;
    ArrayList<apparelItem> apparelitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        apparelitems = ApparelItemProvider.generateData();

        itemAdapter = new ItemAdapter(apparelitems);
        itemslistview = (RecyclerView) findViewById(R.id.listall);
        itemslistview.setLayoutManager(lm);
        itemslistview.setAdapter(itemAdapter);


    }
}
