package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		/*ArrayList<Integer> al1=new ArrayList<Integer>();
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			int value=itr.next();
			int square=value*value;
			al1.add(square);
		}
		System.out.println("al :"+al);
		System.out.println("al1 :"+al1);
		*/
		List<Integer> li=al.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("al :"+al);
		System.out.println("li :"+li);
	}
}
