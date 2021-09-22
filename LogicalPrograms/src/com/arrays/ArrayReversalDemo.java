package com.arrays;

import java.util.Scanner;

public class ArrayReversalDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Take size of array from user
		System.out.println("Enter size of array :");
		int n=sc.nextInt();
		
		//Declaring array
		int arr[]=new int[n];
		System.out.println("Enter Arrays Values :");
		
		//Input array values
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
		
		//Logic to reverse array
		int temp;
		int start=0; //represent start element of array
		int end=n-1; //represent end element of array
		
		//Now we have to reverse it
		//1 2 3 4 5
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		System.out.println("array after sorting :");
		for (int i = 0; i < n; i++) {
			System.out.print(" "+arr[i]);
		}
	}

	}
