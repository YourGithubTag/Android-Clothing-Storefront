package com.example.apparelmarket;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class SearchActivity extends AppCompatActivity {
    RecyclerView itemslistview;
    ItemAdapter itemAdapter;
    ArrayList<apparelItem> apparelitems;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.searchactivity);
        LinearLayoutManager lm = new LinearLayoutManager(this);

        itemAdapter = new ItemAdapter(apparelitems);
        itemslistview = (RecyclerView) findViewById(R.id.listall);
        itemslistview.setLayoutManager(lm);
        itemslistview.setAdapter(itemAdapter);




    }


}
