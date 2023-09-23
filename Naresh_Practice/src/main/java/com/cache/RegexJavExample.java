package com.cache;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexJavExample {
	public static void main(String[] args) {
		String naresh="ab12nareshbhabat119sdasd";
		Pattern pattern1 = Pattern.compile(".*\\d+.*");
		 Matcher matcher
         = pattern1.matcher(naresh);
		System.out.println(matcher.matches());
	}

}
