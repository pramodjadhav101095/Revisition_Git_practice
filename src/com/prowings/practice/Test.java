package com.prowings.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		String[] input = {"apple", "banana", "cherry", "apricot"};
				
	//	Output: {a=[apple, apricot], b=[banana], c=[cherry]}
		
		//List<String> input =Arrays.asList("apple", "banana", "cherry", "apricot");
		
	Map<Character,List<String>> group	= Arrays.stream(input).collect(Collectors.groupingBy(s-> s.charAt(0)));
	
	System.out.println(group);
		
		

	}

}
