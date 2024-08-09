package com.dennis.removeDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

    public static List<Integer> removeDuplicates(List<Integer> myList) {

        List<Integer> newList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < myList.size(); i++) {
            set.add(myList.get(i));
        }

        set.forEach(x -> {
            newList.add(x);
        });

        return newList;
    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8, 9]

            (Order may be different as sets are unordered)
        */

    }

}

