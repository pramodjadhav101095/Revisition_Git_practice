package com.prowings.practice;

class Outer
{
class Inner
{
public void methodOne(){
System.out.println("inner class method");
}
}
public static void main(String[] args)
{
//	  // Step 1: Create an instance of the Outer class
//    Outer outerInstance = new Outer();
//    
//    // Step 2: Use the outer instance to create an instance of the Inner class
//    Outer.Inner innerInstance = outerInstance.new Inner();
//    
//    // Step 3: Call the method of the Inner class instance
//    innerInstance.methodOne();
    
    new Outer().new Inner().methodOne();
}


}