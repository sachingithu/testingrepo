package com.strings;

public class StringSorting {

	public static void main(String[] args) {
		String a[]= {"Sachin","Virat","Dhoni","Ajinkya","Hardik"};
		
		String temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j].compareTo(a[i])>0) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
