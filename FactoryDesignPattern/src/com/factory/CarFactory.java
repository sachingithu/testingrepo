package com.factory;

import com.comps.Baleno;
import com.comps.Car;
import com.comps.CarTyres;
import com.comps.Swift;

public class CarFactory {
	
	//static factory method
	public static Car getCar(String type) {
		//Create CarTyre Object
		CarTyres ctyre=new CarTyres();
		Car car=null;
		if (type.equalsIgnoreCase("baleno")) {
			car=new Baleno(ctyre);
		}
		else if (type.equalsIgnoreCase("swift")) {
			car=new Swift(ctyre);
		}
		else if (type.equalsIgnoreCase("ertiga")) {
			
		}
		else {
			throw new IllegalArgumentException("Invalid Car Type");
		}
		car.assemble();
		car.roadTest();
		return car;
	}
}
