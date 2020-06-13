package com.example.apparelmarket;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Searchclass {
    public static ArrayList<apparelItem> searchFunction(String query, ArrayList<apparelItem> toSearch) {
        ArrayList<apparelItem> toReturn = new ArrayList<apparelItem>();

        for (int i = 0; i < toSearch.size(); i++){
            if (toSearch.get(i).getName().contains(query) || toSearch.get(i).getCategory().contains(query)) {
                toReturn.add(toSearch.get(i));
            }
        }
        if (toReturn.isEmpty()) {
           apparelItem notfound= new apparelItem("null","No results found", "null", "null", "null", R.drawable.b001, 1);
           toReturn.add(notfound);
        }

        return toReturn;
    }

}
