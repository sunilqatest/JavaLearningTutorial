package com.learn.java.string;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels {

	public static void main(String[] args) {
		
		 String str = "Sunil";
		 System.out.println(removeVowels(str));

	}

	private static String removeVowels(String str) {
		
		Character vowels[] ={'a','e','i','o','u','A','E','I','O','U'};
		List<Character> vowelslist = Arrays.asList(vowels);
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < sb.length(); i++) {
			if (vowelslist.contains(sb.charAt(i))) {
				sb.replace(i,i+1,"");
				i--;
			}
		}
		return sb.toString();
	}

}
