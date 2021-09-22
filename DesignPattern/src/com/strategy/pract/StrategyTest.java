package com.strategy.pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Value :");
		double a=Double.parseDouble(br.readLine());
		
		System.out.println("Enter Second Value :");
		double b=Double.parseDouble(br.readLine());
		
		//Create Target Class Object
		
		Context c=new Context();
		
		//Assign Dependent Class Object To Target Class Object
		
		c.setStrategy(new Addition());
		System.out.println("Addition is :"+c.executeCalculation(a, b));

		c.setStrategy(new Subtraction());
		System.out.println("Subtraction is :"+c.executeCalculation(a, b));
		
		c.setStrategy(new Multiplication());
		System.out.println("Multiplication is :"+c.executeCalculation(a, b));
		
		c.setStrategy(new Division());
		System.out.println("Division is :"+c.executeCalculation(a, b));
	}

}
