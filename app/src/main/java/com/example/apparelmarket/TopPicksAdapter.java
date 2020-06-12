package com.example.apparelmarket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class TopPicksAdapter extends RecyclerView.Adapter<TopPicksAdapter.TopPickitemViewHolder> {

    private ArrayList<apparelItem> listofitems;
    private TopPicksAdapter.OnItemClickListener clickListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListner(TopPicksAdapter.OnItemClickListener listener) {
        clickListener = listener;
    }

    public static class TopPickitemViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivImage;
        public TextView  tvName;

        public TopPickitemViewHolder(@NonNull View itemView, final TopPicksAdapter.OnItemClickListener passed) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.image_top_picks);
            tvName = itemView.findViewById(R.id.text_top_picks);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (passed != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            passed.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    @NonNull
    @Override
    public TopPicksAdapter.TopPickitemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlistview, parent, false);
        TopPicksAdapter.TopPickitemViewHolder itemviews = new TopPicksAdapter.TopPickitemViewHolder(v, clickListener);
        return itemviews;
    }

    public TopPicksAdapter(ArrayList<apparelItem> list) {
        listofitems = list;
    }

    @Override
    public void onBindViewHolder(@NonNull TopPicksAdapter.TopPickitemViewHolder holder, int position) {
        apparelItem currentItem = listofitems.get(position);

        holder.ivImage.setImageResource(currentItem.getitemImage());
        holder.tvName.setText(currentItem.getName());
    }

    @Override
    public int getItemCount() {
        return listofitems.size();
    }




}
