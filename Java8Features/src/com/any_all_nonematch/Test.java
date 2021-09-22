package com.any_all_nonematch;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("core java advance java");
		al.add("AWS Data Science");
		al.add("HTML CSS JavaScript");
		//Storing all objects in stream object
		Stream<String> str=al.stream();
		//boolean b=str.anyMatch((x)->{return x.startsWith("Core");});
		//System.out.println("b :"+b);
		
		boolean b=str.allMatch((x)->{return x.startsWith("AWS Data Science");});
		System.out.println("b :"+b);

	}

}
