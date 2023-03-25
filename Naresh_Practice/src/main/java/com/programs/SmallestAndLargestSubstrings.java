package com.programs;

public class SmallestAndLargestSubstrings {

    public static void main(String[] args) {
        String s = "welcometojava";
        System.out.println("chart 1::  " + s.substring(3,4));
        
        int k = 3;

        String smallest = "";
        String largest = "";

        for (int i = 0; i < s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (i == 0) {
                smallest = substring;
                largest = substring;
            } else {
                if (substring.compareTo(smallest) < 0) {
                    smallest = substring;
                }
                if (substring.compareTo(largest) > 0) {
                    largest = substring;
                }
            }
        }

        System.out.println("Smallest substring: " + smallest);
        System.out.println("Largest substring: " + largest);
    }

}
