package com.logical;

class Fibonacci { 
	int a=0;
	int b=1;
	int c;
	
	void showFibo() {
		for (int i = 1; i <=10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
					
		}
	}
	public static void main(String args[]) 
	{ 
		Fibonacci f=new Fibonacci();
		f.showFibo();
	} 
} 

