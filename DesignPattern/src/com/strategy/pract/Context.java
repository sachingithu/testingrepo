package com.strategy.pract;

public class Context {

	private Strategy strategy;
	Context(){
	System.out.println("Context.Context()");
	
	}
	
	

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public double executeCalculation(double a,double b) {
		return strategy.calculation(a, b);
	}
}
