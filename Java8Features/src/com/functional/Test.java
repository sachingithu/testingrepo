package com.functional;
@FunctionalInterface
interface A{
	void m1();
	//void m2();Invalid '@FunctionalInterface' annotation; 
						//A is not a functional interface
	default void m3() {}//valid
	static void m4() {}//valid
}
public class Test {

	public static void main(String[] args) {
		A a1=()->System.out.println("m1() method executed....");
		a1.m1();

	}

}
