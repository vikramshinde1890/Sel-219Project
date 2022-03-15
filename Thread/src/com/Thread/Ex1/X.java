package com.Thread.Ex1;

import java.util.Set;
import java.util.TreeMap;

public class X {
	public static void main(String[] args) {
		TreeMap<Integer, String> p = new TreeMap<Integer, String>();
		p.put(32, "pune");
		p.put(64, "mumbai");
		p.put(28, "satara");
		System.out.println(p);
		
		Set<Integer> keys = p.keySet();
		System.out.println(keys);
		
		for(int key : keys ) {
			System.out.println(key);
			String v= p.get(key);
			System.out.println(v);
		}
		System.out.println(keys);
		}
		
	}


