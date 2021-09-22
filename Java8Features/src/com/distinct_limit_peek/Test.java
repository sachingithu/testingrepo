package com.distinct_limit_peek;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(33);
		al.add(39);
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(10);
		System.out.println("Elements In Arraylist :"+al);
		System.out.println("============================");
		System.out.println("Duplicate Removed by appliying distinct() method :");
		Stream<Integer> s=al.stream().distinct();
		Object[] o=s.toArray();
		for(Object o1:o) {
			System.out.print(o1+" ");
		}
		System.out.println();
		System.out.println("=============================");
		System.out.println("Appliying limit() method :");
		Stream<Integer> s1=al.stream().limit(3);
		Object[] ob=s1.toArray();
		for(Object obj:ob) {
			System.out.print(obj+" ");
		}
		System.out.println();
		System.out.println("==================================");
		System.out.println("Appliying peek() method To perform operations :");
		Stream<Integer> s2=al.stream().peek((x)->System.out.println(x+"---"+(x*x)));
		Object obje[]=s2.toArray();
		for(Object object:obje) {
			System.out.print(object+" ");
		}
		System.out.println();
		System.out.println("=======================");
		System.out.println("Single Line Code");
		Stream<Integer> str=al.stream()
							  .distinct()
							  .limit(3)
							  .peek((m)->{System.out.println(m+"----"+(m*m));})
							  ;
		System.out.println(str);
	}

}
