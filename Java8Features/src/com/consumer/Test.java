package com.consumer;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bi=(Integer x,Integer y)->{
			int sx=x*x;
			int sy=y*y;
			
			int sum=sx+sy;
			System.out.println("Sum Of Squares Of Given Vaulues :"+sum);
			
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values :");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		bi.accept(a, b);

	}

}
