package com.prowings.practice;

public class ObjectCreation_Ways {
	
	
	// we can create objecrt by multiple ways . some of the are below....
	
	//1. By using new Operator :
	
	Object o = new Object();
	
	//2. By using refelection API
	
	//Object o2 = (Object)Class.forName("Object").newInstance();
	
	//By using newInstance() :(Reflection Mechanism)  since java 9 new instace meth0d is deperecated
	try {
		Object obj = Object.class.getDeclaredConstructor().newInstance();
	} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
	    e.printStackTrace();
	}
}
}