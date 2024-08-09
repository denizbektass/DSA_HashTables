package com.dennis.findPairs;

import java.util.*;


public class Main {

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {

        HashSet<Integer> set = new HashSet<>();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(target - arr2[i])) {
                list.add(new int[]{target - arr2[i], arr2[i]});
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }

}


