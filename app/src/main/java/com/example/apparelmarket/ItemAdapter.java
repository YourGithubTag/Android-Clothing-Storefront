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

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.itemViewHolder> {
    private ArrayList<apparelItem> listofitems;
    private OnItemClickListener clickListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListner(OnItemClickListener listener) {
        clickListener = listener;
    }

    public static class itemViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivImage;
        public TextView  tvName;

        public itemViewHolder(@NonNull View itemView, final OnItemClickListener passed) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.listitemimage);
            tvName = itemView.findViewById(R.id.listitemname);

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
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlistview, parent, false);
        itemViewHolder itemviews = new itemViewHolder(v, clickListener);
        return itemviews;
    }

    public ItemAdapter(ArrayList<apparelItem> list) {
        listofitems = list;
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        apparelItem currentItem = listofitems.get(position);

        holder.ivImage.setImageResource(currentItem.getitemImage());
        holder.tvName.setText(currentItem.getName());
    }

    @Override
    public int getItemCount() {
        return listofitems.size();
    }
}
