package com.prowings.practice;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Test1 {


	
	public static void main(String[] args) {
		//ConcurrentHashMap m = new ConcurrentHashMap();
		HashMap m = new HashMap();
		m.put(101, "Ddd");
		m.put(101, "Ravi");
	System.out.println(m);
		System.out.println(m.put(101, "Ravi")); //{101=Ravi}
//		m.putIfAbsent(101, "Siva");
//		System.out.println(m); //{101=Ravi}
		}
}
