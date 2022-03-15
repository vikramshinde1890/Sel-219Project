package com.Thread.Ex1;

public class New {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		JOB1 jb= new JOB1();
		jb.start();
		System.out.println(Thread.currentThread().getName());
		
		JOB1 jc= new JOB1();
		jc.start();
		System.out.println(Thread.currentThread().getName());
	}

}
