package com.logical;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		
		int no=sc.nextInt();
		 
		int temp=no;
		int rev=0,rem;
		
		while(temp!=0) {
			rem=temp%10;
			
			rev=rev*10+rem;
			
			temp=temp/10;
		}
		if(no==rev) {
			System.out.println("Given Number Is Palindrom...");
		}else {
			System.out.println("Given Nmuber Not  Palindrom...");
		}
	}

}
