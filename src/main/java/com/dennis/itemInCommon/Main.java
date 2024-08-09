package com.dennis.itemInCommon;

import java.util.HashMap;

public class Main {

    public static Boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            hashMap.put(array1[i], true);
        }
        for (int i = 0; i < array2.length; i++) {
            if (hashMap.get(array2[i]) != null) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] array1 = {1, 2, 5};
        int[] array2 = {2, 4, 6};

        System.out.println(itemInCommon(array1, array2));

        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */

    }

}
