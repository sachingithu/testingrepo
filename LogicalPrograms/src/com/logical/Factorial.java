package com.logical;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No For Finding Factorial :");
		int no=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial Of "+no+" IS "+fact);

	}

}
