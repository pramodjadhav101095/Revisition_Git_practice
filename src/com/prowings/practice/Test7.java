package com.prowings.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {

	// /Test/src/com/prowings/practice/input.txt
	// E:\J12_STS_WorkSpace\Test\src\com\prowings\practice\input.txt
	public static void main(String[] args) {
		
//		List<Employee2> list = Arrays.asList(
//				
//				new Employee2 ("Swati kasar"),
//				new Employee2("Pramod jadhav"),
//				new Employee2("zzz   hhh")
//				
//				);
		String[] names= {"Swati kasar","Pramod jadhav","sss ggg"};		
		
		List<String>list= Arrays.asList(names);
		
        List<String>  emp = list.stream()
        		//.sorted(Comparator.comparing(name-> {
        		//	String[] string = 
        					
        					.sorted(Comparator.comparing(name -> {
        	                    String[] parts = name.trim().split("\\s+");
        	                    return parts[parts.length - 1];
        			
        		}
        		
        			 ))
        		.collect(Collectors.toList());
        System.out.println(emp);

	}

}
