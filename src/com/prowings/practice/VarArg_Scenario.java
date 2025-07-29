package com.prowings.practice;

public class VarArg_Scenario {

	
	public void methodOne(int... i) {
		
		System.out.println("Parent class var arg");
	}
}

class Child extends VarArg_Scenario{
	
	public void methodOne(int i) {
		System.out.println("Chile class method one");
	}
}

class Test {
	
	public static void main(String[] args) {
		
		VarArg_Scenario vc = new VarArg_Scenario();
		 vc.methodOne(10);
		
		 Child c = new Child();
		 c.methodOne(20);
		 
		 VarArg_Scenario vc2= new Child();
		 vc2.methodOne(30);
	}
}
