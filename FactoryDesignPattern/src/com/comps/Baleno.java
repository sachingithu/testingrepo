package com.comps;

public class Baleno implements Car {
//We cannot create Car object without cartyres object
	private CarTyres cartyre;
	
	public Baleno(CarTyres cartyre) {
		this.cartyre=cartyre;
	}
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
System.out.println("Baleno.assemble()::Assembled");
	}

	@Override
	public void roadTest() {
		// TODO Auto-generated method stub
System.out.println("Baleno.roadTest()::Road Tested");
	}
	@Override
	public String toString() {
		return "Baleno Car With [cartyre=" + cartyre + "]";
	}

}
