package com.logical;

public class MissingNumber {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,9,10};
	int sum1=0;
	//First find sum of all element in array
	for (int i = 0; i < a.length; i++) {
		sum1=sum1+a[i];
	}
	System.out.println("Sum of Element of array :"+sum1);
	
	int sum2=0;
	//Find sum of element of array including missing number
	for (int i = 1; i <=10; i++) {
		sum2=sum2+i;
	}
	System.out.println("Sum of Element of array in range :"+sum2);
	
	System.out.print("Missing Number Is :"+(sum2-sum1));
}
}
