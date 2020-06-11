package com.example.apparelmarket;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Searchclass {

    public static void main(String[] args) {
        System.out.println(searchFunction("fortnite", ApparelItemProvider.generateData()))
    }
    
    public static ArrayList<apparelItem> searchFunction(String query, ArrayList<apparelItem> toSearch) {
        ArrayList<apparelItem> toReturn = new ArrayList<apparelItem>;

        for (int i = 0; i < toSearch.size(); i++){
            if (toSearch.get(i).getName().contains(query) || toSearch.get(i).getCategory().contains(query)) {
                toReturn.add(toSearch.get(i));
            }
        }
        return toReturn;
    }

}
