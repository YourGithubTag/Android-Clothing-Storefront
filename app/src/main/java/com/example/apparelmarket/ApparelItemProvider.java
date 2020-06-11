package com.example.apparelmarket;
import java.io.Serializable;
import java.util.ArrayList;

public class ApparelItemProvider implements Serializable {
    static String[] itemnames = {"Yeezies", "Louis V", "Fortnite Shirt","Light Up Shoes", "Tapout Vest", "Fedora", "Cargo Shorts", "Neckbeard",
            "Ahegao Shirt"};

    static String[] ids = {"001", "002", "003", "004", "005", "006", "007", "008",
            "009"};

    static String[] itemCategorynames ={"shoes", "shirt", "shirt", "shoes", "vest", "hat", "shorts", "fat",
            "shirt"};
    static String[] itemPricetags = {"$5.00", "$5.00", "$5.00", "$5.00", "$5.00", "$5.00", "$5.00", "$5.00",
            "$5.00"};
    static int[] itemImageaddrs = {R.drawable.b001, R.drawable.b002, R.drawable.b003, R.drawable.b004,R.drawable.b005,R.drawable.b006,R.drawable.b007,
            R.drawable.b008,R.drawable.b009};


    public static ArrayList<apparelItem> generateData() {
        ArrayList<apparelItem>  apparelItemslist = new ArrayList<apparelItem>();


        for (int i = 0; i < 9; i++) {
            String idIN = ids[i];
            String itemNameIN = itemnames[i];
            String itemCategoryIN = itemCategorynames[i];
            String itemPriceIN = itemPricetags[i];
            String itemDescriptionIN = "Epic product please buy";
            int itemImageIN = itemImageaddrs[i];

            apparelItem ApparelItemIN = new apparelItem(idIN,itemNameIN,itemDescriptionIN,itemCategoryIN, itemPriceIN, itemImageIN);
            apparelItemslist.add(ApparelItemIN);
        }
        return apparelItemslist;
    }

}
