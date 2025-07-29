package com.prowings.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String [] a ={"a","b","c"};
		String [] b ={"c","d","e"};
		String[] c={"e","f","g"};


System.out.println(Arrays.toString(a));

    List<String[]>    list      =Arrays.asList(a,b,c);
  
    List<String[]> result=list.stream().distinct().collect(Collectors.toList());
    System.out.println(result.toArray().toString());
    
		
//		 String[] result = Stream.of(a,b,c)
//		  .flatMap(Arrays::stream)
//		  .distinct().toArray(String[]:: new);
//		 
//		 System.out.println(Arrays.toString(result));
//		 
//		
	
	}

}
