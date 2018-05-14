package com.opps.overridingRules;

import java.io.FileNotFoundException;
import java.io.IOException;

	class BaseExp{
		
		//For Rule 5
		void display()
		{
			System.out.println("Base Class");
		}
			
		  protected void print() throws IOException {
			  System.out.println("Print method of Base Class");
		    }
		
		
	}

	class DerivedExp extends BaseExp{
		
		/*
		 * Rule 5: The overriding method can throw an unchecked (runtime)
		 *  exception regardless of whether the overridden method declares the exception. 
		 *  Display method of derived class thrown an unchecked exception which is 
		 *  not handled by base class
		 */
		void display() throws NullPointerException
		{
			System.out.println("Derived Class");
		}
		
		/*
		 * 
		* And in the example below, the DerivedExp class won’t compile because
		 * its print() method throws Exception which is superclass (broader) of the IOException.
		 */
		//protected void print() throws Exception{}
		
		protected void print() throws FileNotFoundException {
			System.out.println("Print method of Derived Class");
	        
	    }
		
		
		
	}
public class RulesException {

	public static void main(String[] args) throws FileNotFoundException {
		DerivedExp d=new DerivedExp();
		d.print();
	}

}
