package com.opps.ConstructorPractice;


class Base
{
 String name;

 Base()
 {
     System.out.println("No-argument constructor of base class");
 }


 Base(String name)
 {
     this.name = name;
     System.out.println("Calling parameterized constructor of base");
 }
}

class Derived extends Base
{

 Derived()
 {
     System.out.println("No-argument constructor of derived");
 }

 Derived(String name)
 {
	 //invokes base class constructor 
     super(name);
     System.out.println("Calling parameterized constructor of derived");
 }

 
}

class ConstructorChaining{
	public static void main(String args[])
	 {
	    
	     Derived obj = new Derived("test");

	 }
	
}
