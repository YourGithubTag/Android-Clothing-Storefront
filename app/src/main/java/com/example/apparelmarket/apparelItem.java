package com.example.apparelmarket;
import androidx.annotation.NonNull;

import java.io.Serializable;

public class apparelItem implements Serializable{
    private String id;
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemCategory;
    private int itemImage;

    public apparelItem(String id, String itemName, String itemDescription,String itemCategory,String itemPrice, int itemImage){
        this.id = id;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
        this.itemImage =  itemImage;
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

    public void changetext1(String text) {
        itemName = text;
    }

    @NonNull
    @Override
    public String toString() {
        return itemName;
    }

}
