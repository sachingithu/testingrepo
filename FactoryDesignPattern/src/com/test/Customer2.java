package com.test;

import com.comps.Car;
import com.factory.CarFactory;

public class Customer2 {

	public static void main(String[] args) {
		Car car2=CarFactory.getCar("swift");
		System.out.println(car2);

	}

}
