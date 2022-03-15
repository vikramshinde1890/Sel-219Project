package com.Thread.Ex1;

public class JOB1 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	/* for(int i=20; i<30; i++) //change value i<300 and check the magic(in New class) of parallel programming.
		{
			System.out.println("In Job-1>" + i);
		} */
	}

}
