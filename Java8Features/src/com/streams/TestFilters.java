package com.streams;
//Filter method internally uses functional interface i.e. predicate
//which gives value true or false
//whatever element we are giving to map on every i/p map generates one o/p
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilters {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(40);
		al.add(20);
		al.add(71);
		al.add(33);
		al.add(15);

		//Stream<Integer> s1 = al.stream().filter((x) -> x % 2 == 0);

		/*
		 * Object[] o=s1.toArray();
		 * 
		 * for(Object o1:o) { System.out.println(o1); }
		 * 
		 * List<Integer> l=s1.collect(Collectors.toList()); System.out.println(l);
		 */
		/*
		 * List<Integer>
		 * li=al.stream().filter((x)->x%2==0).collect(Collectors.toList());
		 * System.out.println(li);
		 */

		List<Integer> li = al.stream()
							 .filter((x) -> x % 2 == 0)
							 .collect(Collectors.toList());
		System.out.println(li);

	}

}
