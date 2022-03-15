package com.Thread.Ex1;

public class Tsum extends Thread {
	static double sum=0;
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			sum=sum+i;
		}
		System.out.println("SUM : "+sum);
	}
}
