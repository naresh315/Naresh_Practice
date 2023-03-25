package com.programs;

 
public class AnagramsUsingLogic {
	public static boolean areAnagrams(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		s1 =s1.toLowerCase();
		s2 =s2.toLowerCase();
		
		int[] counts = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			System.out.println("s1.charAt(i)"+s1.charAt(i));
			System.out.println("s2.charAt(i)"+s2.charAt(i));
			
			counts[s1.charAt(i)]++;
			counts[s2.charAt(i)]--;
		}
		for (int count : counts) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "Hello";
		if (areAnagrams(s1, s2)) {
			System.out.println(s1 + " and " + s2 + " are anagrams.");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams.");
		}
	}
	
}