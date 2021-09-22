package com.pattern;

public class TrianglTwo {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//For Row
			
			for(int j=4;j>=i;j--) {//For Column
												
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
