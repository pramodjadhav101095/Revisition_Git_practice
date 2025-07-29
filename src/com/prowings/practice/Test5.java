package com.prowings.practice;

import java.util.Scanner;

import javax.swing.SortOrder;

public class Test5 {

	// Accept 5 numbers from the user .. Accept the sorting order from the user ...And display the numbers in the requested sorting order

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[5];
	 System.out.println("Enter Numbers");
	
		for( int i=0;i<5;){
			System.out.println("Enter number" + " :");
			
		String input = sc.nextLine().trim();
		try {
			numbers[i]=Integer.parseInt(input);
			i++;
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid input");
		}
		}
		
		String sortOrder;
		while(true) {
			System.out.println("Enter sorting order -");
			sortOrder  =sc.nextLine().trim().toLowerCase();
			if (sortOrder.equals("ascending")|| sortOrder.equals("descending")) {
				break;
				
			}
			else {
				System.out.println("invalid order");
			}
		}
		
	
	
	for(int i=0; i< numbers.length-1;i++) {
		
		for(int j=i+1; j < numbers.length; j++) {
			
			boolean swap = false;
			
			if(sortOrder.equals("ascending") && numbers[i] > numbers[j]) {
				swap = true;
			}
			else if (sortOrder.equals("descending") && numbers[i] < numbers[j]) {
				swap = true;
			}
			if(swap) {
				
				int temp = numbers[i];
				numbers[i]= numbers[j];
				numbers[j] = temp;
			}
		}
	}
	System.out.println(sortOrder);
	for(int num : numbers) {
		System.out.println(num);
	}
	sc.close();
}
}