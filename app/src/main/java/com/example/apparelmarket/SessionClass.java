package com.example.apparelmarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SessionClass {
   public static ArrayList<apparelItem> toppickarray = new ArrayList<apparelItem>();

   public static void generateData() {
       toppickarray.add(0,ApparelItemProvider.apparelItemslist.get(1));
       toppickarray.add(1,ApparelItemProvider.apparelItemslist.get(2));
       toppickarray.add(2,ApparelItemProvider.apparelItemslist.get(3));
   }

    public static void largestthree() {
        int i, first, second, third;
        int firstindex,secondindex,thirdindex;


        third = first = second = Integer.MIN_VALUE;
        firstindex = secondindex = thirdindex = 0;
        for (i = 0; i < ApparelItemProvider.apparelItemslist.size() ; i ++)
        {
            /* If current element is greater than
            first*/
            if (ApparelItemProvider.apparelItemslist.get(i).getViews() > first)
            {
                third = second;
                second = first;
                first = ApparelItemProvider.apparelItemslist.get(i).getViews();

                thirdindex = secondindex;
                secondindex = firstindex;
                firstindex = i;

            }

            /* If arr[i] is in between first and
            second then update second  */
            else if (ApparelItemProvider.apparelItemslist.get(i).getViews() > second)
            {
                third = second;
                second = ApparelItemProvider.apparelItemslist.get(i).getViews();

                thirdindex = secondindex;
                secondindex = i;

            }

            else if (ApparelItemProvider.apparelItemslist.get(i).getViews() > third)
                third = ApparelItemProvider.apparelItemslist.get(i).getViews();
                thirdindex = i;

        }
        toppickarray.set(2,ApparelItemProvider.apparelItemslist.get(thirdindex) );
        toppickarray.set(1,ApparelItemProvider.apparelItemslist.get(secondindex) );
        toppickarray.set(0,ApparelItemProvider.apparelItemslist.get(firstindex) );

    }
}