package com.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		Supplier<String> s=()->{
			System.out.println("Enter The String :");
			Scanner sc=new Scanner(System.in);
			String var=sc.next();
			int value=var.length();
			return "Length Of Given String Is :"+value;
		};
		String output=s.get();
		System.out.println(output);

	}

}
