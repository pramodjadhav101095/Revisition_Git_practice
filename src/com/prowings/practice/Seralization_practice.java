package com.prowings.practice;

import java.io.Serializable;
import java.util.logging.LogManager;

public class Seralization_practice implements Serializable {
	
	


	Cat c = new Cat();
	
	 @Override
	    public String toString() {
	        return "Seralization_practice{c=" + c + "}";
	    }
}

