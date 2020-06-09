package com.example.apparelmarket;
import java.io.Serializable;

public class ApparelItem implements Serializable{
    private String id;
    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private String itemCategory;
    private int itemImage;

    public ApparelItem(String id, String itemName, String itemDescription,String itemCategory,String itemPrice, int itemImage){
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
}
