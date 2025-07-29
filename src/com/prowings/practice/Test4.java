package com.prowings.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer>list =Arrays.asList(1,2,3,1,2,3);  
		
		List<Integer> l= list.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		
		
		List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));
        
     List<Employee>emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
     System.out.println(emp);
     
     
     List<String> sentences = Arrays.asList("Hello World", "Java 8 FlatMap");

     List<String> words = sentences.stream()
        .flatMap(s -> Arrays.stream(s.split(" ")))
        . collect(Collectors.toList());

     System.out.println(words);



	}

}
