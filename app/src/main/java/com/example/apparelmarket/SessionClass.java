package com.example.apparelmarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SessionClass {
   static ArrayList<apparelItem> toppickarray;

    public static void largestthree(ArrayList<apparelItem> arr) {
        Collections.sort(arr, new Comparator<apparelItem>() {
            @Override
            public int compare(apparelItem o1, apparelItem o2) {
                return o1.getViews() - o2.getViews();
            }
        });

        toppickarray.add(arr.get(0));
        toppickarray.add(arr.get(1));
        toppickarray.add(arr.get(2));
    }
}