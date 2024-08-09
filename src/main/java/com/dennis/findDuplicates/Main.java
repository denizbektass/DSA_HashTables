package com.dennis.findDuplicates;

import java.util.*;


public class Main {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                hashMap.put(nums[i], false);
            }else {
                if(hashMap.get(nums[i]) != null) {
                    hashMap.put(nums[i], true);
                } else {
                    hashMap.put(nums[i], false);
                }
            }
        }

        Object[] object = hashMap.keySet().toArray();
        System.out.println("values : " + hashMap.values());
        for (int i = 0; i < object.length; i++) {
            System.out.println("0 : " + object[i]);
        }
        for (int i = 0; i < object.length; i++) {
            if (hashMap.get(object[i]) == true) {

                list.add((Integer) object[i]);
            }

        }
        return list;
    }

    public static void main(String[] args) {

        int[] nums = {};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);


        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

}

