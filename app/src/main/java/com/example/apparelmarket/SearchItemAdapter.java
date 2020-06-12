package com.example.apparelmarket;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apparelmarket.apparelItem;

import java.util.ArrayList;

public class SearchItemAdapter extends ArrayAdapter<apparelItem> {

    private static class ViewHolder{
        public ImageView ivImage;
        public TextView  tvName;
    }

    public SearchItemAdapter(Context context, ArrayList<apparelItem> itemsforthings){

        super(context, 0, itemsforthings);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //get the data item for this position
        final apparelItem appitem = getItem(position);

        //check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.itemlistview,parent,false);
            viewHolder.ivImage = (ImageView)convertView.findViewById(R.id.listitemimage);
            viewHolder.tvName = (TextView)convertView.findViewById(R.id.listitemname);
            convertView.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //Populate the data into the template view using the data object
        viewHolder.tvName.setText(appitem.getName());
        int resID = appitem.getitemImage();
        viewHolder.ivImage.setImageResource(resID);

        return convertView;
    }

}
