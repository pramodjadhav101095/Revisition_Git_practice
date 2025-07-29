package com.prowings.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		
		
	//String s="A2b5j39"	;
	
	/*
	 * String result
	 * =s.chars().mapToObj(c->String.valueOf(c)).collect(Collectors.joining(" "));
	 * 
	 * System.out.println(result);
	 */
	   
	   
	/*   
	   for(int i=0;i<s.length();i++) {
		   
		   System.out.println(s.charAt(i)+ " ");*/
		   
		
		   
		   String s= "Pramod";
			String s2 ="Programming";
			
		//	Program to count frequency of each word
			
			Map<Character,Long> s1=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
			//System.out.println(s1);
			
			s1.forEach((ch,count)->System.out.println(ch +":"+count));
			
		   
		//Program to Find duplicate Element in String
			
			
			Map<Character,Long> duplicate = s2.chars().mapToObj(c->(char)c)
					                       .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		   
		   
		   duplicate.entrySet().stream()
		                       .filter(e->e.getValue()>1)
		                       .forEach(e->System.out.println("Duplicate Eelemets :"+ e.getKey()+":"+ e.getValue()));
		   
		   
		 //Program to find Java Program: Max Occurring Character
		   
		   String s3 ="misissippi";
		   
		   
		   Map<Character,Long> maxcount = s3.chars().mapToObj(c->(char)c)
                                          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


		Optional<Map.Entry<Character,Long>> max  = maxcount.entrySet().stream().max(Map.Entry.comparingByValue());
		
		max.ifPresent(entry->System.out.println("Max value function :"+entry.getKey()+":"+entry.getValue()));
		
		
		// program to reverse each string 
		
		String s4= "Hello World";
		
		 String result	=Stream.of(s4).map(word -> new StringBuilder(word).reverse().toString())
				 .collect(Collectors.joining(" ")); 
		 
		 System.out.println(result);
		 
		 // java program to find sum of all numbers
		 
		 
		 int number= 12345;
		 
		int num = String.valueOf(number).chars().map(Character::getNumericValue).sum();
		System.out.println("sum of all number  : "+ num);
				   
	   }
	     

    }



