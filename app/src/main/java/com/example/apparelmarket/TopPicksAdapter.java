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

    private ArrayList<apparelItem> listofitems = new ArrayList<apparelItem>();
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

        public TopPickitemViewHolder(@NonNull View itemView, final OnItemClickListener passed) {
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
    public TopPickitemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.toppicklistview, parent, false);
        TopPicksAdapter.TopPickitemViewHolder itemviews = new TopPicksAdapter.TopPickitemViewHolder(v, clickListener);
        return itemviews;
    }

    public TopPicksAdapter() {

    }

    @Override
    public void onBindViewHolder(@NonNull TopPicksAdapter.TopPickitemViewHolder holder, int position) {
        int resID =  SessionClass.toppickarray.get(position).getitemImage();

        holder.tvName.setText(SessionClass.toppickarray.get(position).getName());
        holder.ivImage.setImageResource(resID);
    }

    @Override
    public int getItemCount() {
        return SessionClass.toppickarray.size();
    }




}
