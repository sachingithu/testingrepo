package com.singletone;

public class TestSingletone {

	private static TestSingletone t;
	private TestSingletone() {
		
	}                                                                                                                          
	public static TestSingletone getTest() {
		t=new TestSingletone();
		return t;
		
	}
	public static void main(String[] args) {
		TestSingletone t1= TestSingletone.getTest();
		TestSingletone t2= TestSingletone.getTest();
	}
	

}
