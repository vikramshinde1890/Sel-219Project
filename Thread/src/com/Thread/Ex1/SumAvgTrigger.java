package com.Thread.Ex1;

public class SumAvgTrigger {
	public static void main(String[] args) {
		Tsum x = new Tsum();
		x.start();
		
		Tavg y= new Tavg();
		y.start();
	}

}
