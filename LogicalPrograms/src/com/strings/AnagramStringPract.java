package com.strings;

import java.util.Arrays;

public class AnagramStringPract {
	static void isAnagram(String str1,String str2) {
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");
		Boolean status=true;
		if(s1.length()!=s2.length()) {
			status=false;
		}else {
			char[] array1=s1.toLowerCase().toCharArray();
			char[] array2=s2.toLowerCase().toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			status=Arrays.equals(array1, array2);
			if(status) {
				System.out.println("String "+s1+" And "+s2+" Are Anagram...");
			}else {
				System.out.println("String "+s1+" And "+s2+" Are Not Anagram...");
			}
		}
	}
	public static void main(String[] args) {
		isAnagram("Sachin", "Nachis");
		isAnagram("Sachin", "Virat");
		

	}

}
