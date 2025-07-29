package com.prowings.practice;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("Java", "Python", "C++", "JavaScript","Java");
		
            //	Output : 4 = JAVA, .......
		
		
	Map<Integer,String> map	=stream.collect(Collectors.toMap(String::length, s->s,(oldvalue,newvalu)->oldvalue));
	//Map<Integer,String> map	=stream.collect(Collectors.toMap(String::length, s->s));
		
	//	map.forEach((k,v)->System.out.println(k+ "="+ v));
	System.out.println(map);
		
	
	

	}

	 
	 
	
	
}
