package com.arrays;

public class SecondLargestAndSmallest {
public static void main(String[] args) {
	int a[]= {4,8,3,9,5,6,2};
	
	int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			
	}
	System.out.println("Sorted Array IS :");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("********************************");
	System.out.println("Second Largest Element is :"+a[1]);
}
}
