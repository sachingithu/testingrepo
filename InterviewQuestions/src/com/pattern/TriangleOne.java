package com.pattern;

public class TriangleOne {

	public static void main(String[] args) {
		//We Require two for Loops
		//One(i)For Row and Second(j) for Column
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	
	}

}
