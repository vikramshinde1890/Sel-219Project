package com.Thread.Ex1;

public class Tavg extends Thread {
	
	public void run() {
		Tsum x = new Tsum();
		double avg=(x.sum)/20;
		
		System.out.println("Average: "+avg);
	}

}
