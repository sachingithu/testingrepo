package com.defaultmethods;
//If our interface is implemented by 100 of classes ,we should implements method in 
//those 100 classes
interface I{
	void m1();
}
class A implements I{
	public void m1() {
		System.out.println("A.m1()");
	}
}
class B implements I{
	public void m1() {
		System.out.println("B.m1()");
	}
}
public class Test {

	public static void main(String[] args) {
		
		I i=new A();
		i.m1();
		
		I i2=new B();
		i2.m1();

	}

}
