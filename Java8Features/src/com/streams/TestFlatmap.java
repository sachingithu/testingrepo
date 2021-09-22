package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatmap {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sachin Jadhav At Marlabs");
		al.add("ViratKohli Mahendra Dhoni Rohit");
		al.add("Salman Amir");
		
		Stream<String> s=al.stream()
						   .flatMap((String x)->{
			String[] value=x.split(" ");
			return Arrays.asList(value).stream();
		});
		List<String> l=s.collect(Collectors.toList());
		System.out.println(l);
	}
}
