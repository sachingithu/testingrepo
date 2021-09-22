package com.test;

import com.comps.Car;
import com.factory.CarFactory;

public class Customer1 {
	public static void main(String[] args) {
		Car car1=CarFactory.getCar("baleno");
		System.out.println(car1);
	}
}
