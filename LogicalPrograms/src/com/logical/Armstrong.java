package com.logical;

public class Armstrong {

	public static void main(String[] args) {
		int no=153;
		int t1=no;
		int len=0; //for calculating length
		//first we have to logic for counting length of number
		
		while(t1!=0) {
			len=len+1;
			t1=t1/10;
		}
		
		//Second logic we have to write for reverse number
		int t2=no;
		int arm=0;
		int rem;
		while(t2!=0) {
			int mul=1;
			rem=t2%10;
			for (int i = 1; i <=len; i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no) {
			System.out.println(no+" Is Armstrong");
		}else {
			System.out.println(no+" Is Not Armstrong");
		}
	}
}
