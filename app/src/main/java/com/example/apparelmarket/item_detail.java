package com.example.apparelmarket;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class item_detail extends AppCompatActivity {

    private ImageView imagecover;
    private TextView description;
    private TextView category;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);

        imagecover = (ImageView) findViewById(R.id.itemimageview);
        description = (TextView) findViewById(R.id.descriptionview);
        category = (TextView) findViewById(R.id.categoryview);

        Intent incoming = getIntent();
        // Use the book to populate the data into our views
        int itempos = incoming.getIntExtra(MainActivity.ITEM_DETAIL_KEY,0);

        description.setText(ApparelItemProvider.apparelItemslist.get(itempos).getDescription());
        category.setText(ApparelItemProvider.apparelItemslist.get(itempos).getCategory());
        int resID = ApparelItemProvider.apparelItemslist.get(itempos).getitemImage();

        ApparelItemProvider.apparelItemslist.get(itempos).incrementViews();

        imagecover.setImageResource(resID);
    }



}
