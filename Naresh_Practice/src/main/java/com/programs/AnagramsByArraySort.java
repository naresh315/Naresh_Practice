package com.programs;

import java.util.Arrays;

public class AnagramsByArraySort {
    public static void main(String[] args) {
        String str1 = "lis12ten";
        String str2 = "silent";
        
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all whitespace and convert to lower case
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        // If the strings are not the same length, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convert the strings to char arrays and sort them
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        // Compare the sorted char arrays
        return Arrays.equals(str1Arr, str2Arr);
    }
}
