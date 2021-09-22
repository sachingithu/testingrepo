package com.arrays;

public class EqualityArrays {

	public static void main(String[] args) {
		int arr1[]= {4,10,6,5,3};
		int arr2[]= {4,10,6,3};
		
		Boolean status=true;
		//For Checking length of array are equla or not
		if(arr1.length==arr2.length) {
			//compare each element of both arrray equal or not 
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i]!=arr2[i]) {
					status=false;
				}
			}
		}else {
			status=false;
		}
		
		if (status==true) {
			System.out.println("Arrays Are Equal....");
		} else {
			System.out.println("Arrays Are Not Equal....");
		}
}	
}	