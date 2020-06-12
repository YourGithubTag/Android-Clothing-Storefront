package com.example.apparelmarket;
import androidx.annotation.NonNull;

import java.io.Serializable;

public class apparelItem implements Serializable{
    private String id;
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemCategory;
    private int viewcount;
    private int itemImage;

    public apparelItem(String id, String itemName, String itemDescription,String itemCategory,String itemPrice, int itemImage, int viewcount){
        this.id = id;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
        this.itemImage =  itemImage;
        this.viewcount = viewcount;
    }
    public String getId(){
        return id;
    }

    public String getName() {
        return itemName;
    }
    public String getDescription(){
        return itemDescription;
    }
    public String getCategory(){
        return itemCategory;
    }
    public String getPrice(){
        return itemPrice;
    }
    public int getitemImage(){
        return itemImage;
    }

    public int getViews(){
        return viewcount;
    }
    public void incrementViews() {this.viewcount += 1; }


    public void changetext1(String text) {
        itemName = text;
    }

    @NonNull
    @Override
    public String toString() {
        return itemName;
    }

}
