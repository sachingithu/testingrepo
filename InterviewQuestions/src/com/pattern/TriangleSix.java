package com.pattern;

public class TriangleSix {

	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 7; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
