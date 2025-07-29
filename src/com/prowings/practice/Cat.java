package com.prowings.practice;

import java.io.Serializable;

public class Cat implements Serializable {
	
	Dog d = new Dog();
	 @Override
	    public String toString() {
	        return "Cat{d=" + d + "}";
	    }

}
