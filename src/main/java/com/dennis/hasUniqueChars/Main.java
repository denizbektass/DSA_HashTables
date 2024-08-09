package com.dennis.hasUniqueChars;

import java.util.HashSet;
import java.util.Set;


public class Main {

    public static boolean hasUniqueChars(String string) {
        HashSet<Character> set = new HashSet<>();
        if(string.length() == 0) {
            return true;
        } else {
            for (int i = 0; i < string.length(); i++) {
                if (set.isEmpty()) {
                    set.add(string.charAt(i));
                } else {
                    if (set.contains(string.charAt(i))) {
                        return false;
                    }
                    set.add(string.charAt(i));
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false

        */

    }

}

