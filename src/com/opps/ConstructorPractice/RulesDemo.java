package com.opps.ConstructorPractice;


class constructorDemo
	{
	public static int a=0;
	
		private constructorDemo()
		{
		System.out.println("Constructor called");	
		}
		
		public  static constructorDemo getInstance()
		{
			if (a==0)
			{
				a++;
				return new constructorDemo();
				
			}
			else
				return null;	
			
		}
				
	}
	 	
public class RulesDemo {
	
public static void main(String[] args) {
	
	constructorDemo c=constructorDemo.getInstance();
	// Created 2 instances but since it is a singleton class, only one object is created.
	constructorDemo d=constructorDemo.getInstance();
	System.out.println(d.a);

}
}

