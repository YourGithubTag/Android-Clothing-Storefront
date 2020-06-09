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

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView itemslistview;
    ItemAdapter itemAdapter;
    ArrayList<apparelItem> apparelitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemslistview = (ListView) findViewById(R.id.listall);
        ArrayList<apparelItem> apparelitems = new ArrayList<apparelItem>();

        apparelitems = ApparelItemProvider.generateData();
        itemAdapter = new ItemAdapter(this, apparelitems);

        itemslistview.setAdapter(itemAdapter);

        LinearLayoutManager lm = new LinearLayoutManager(this);
    }
}
