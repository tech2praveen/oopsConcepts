package com.opps.overridingRules;



class TypeReturn
{
	void display()
	{
		System.out.println("Same Return Type");
	}
}
class SubtypeReturn extends TypeReturn{
	
	void display()
	{
		System.out.println("Subtype Return Type");
	}
	
}

class Method1{
	
	public TypeReturn display()
	{
		return new TypeReturn();
	}
	
}

class Derived1 extends Method1{
	
	/*
	 * The return type must be the same as, or subtype of,
	 *  the return type declared in the original overridden method in the superclass.
	 *  
	 * In this class, we can have return type of display method as TypeReturn or SubtypeReturn. 
	 */
	
	//public void display(){}
	
	public SubtypeReturn display()
	{
		return new SubtypeReturn();
	}
	
}


public class Rule2 {
	
	public static void main(String[] args) {
		
		Method1 m=new Method1();
		m.display();
	}

}
