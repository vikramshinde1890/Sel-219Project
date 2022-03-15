package com.Thread.Ex1;

public class JOB1Trigger {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("In Main 11>> "+i);
		}
		JOB1 jb= new JOB1();
		jb.start();  //this for parallel running.
		
		//jb.run(); for sequential running.
		
		for(int j=30; j<1000; j++) {
			System.out.println("In Main 22>> "+j);
		}
	}

}
