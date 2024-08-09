package com.dennis.firstNonRepatingCharacter;

import java.util.*;


public class Main {

    public static Character firstNonRepeatingChar(String word) {
        HashMap<Character, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (i == 0) {
                hashMap.put(word.charAt(i), true);
            } else {
                if (hashMap.get(word.charAt(i)) != null) {
                    hashMap.put(word.charAt(i), false);
                } else {
                    hashMap.put(word.charAt(i), true);
                }
            }
        }

        Object[] arr = hashMap.keySet().toArray();
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get(arr[i])) {
                return (Character) arr[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        System.out.println(firstNonRepeatingChar("aabbcc!"));



        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

}

