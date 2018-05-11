package com.assgn.exception;

import javax.sound.midi.Synthesizer;

public class ExceptionDemo {
	
	
	/*
	 * Everytime the method will return 3 irrespective of whether the exception in thrown or not.
	 * 
	 * 
	 *Finally block throwns a warning saying that "finally block
	 *doesnot end normally", it is because of return statement.
	 *yFinal block is considered to be cleanup block, return is not generally expected in it.
	 * 
	 * 
	 */
	
	public static int throwingMethod()
	{
		try {
			int c=1/0;
			return c;
			
		}
		catch(Exception e)
		{
			//System.exit(0);
			return 2;
			
		}
		finally 
		{
			
			return 3;
		}
	}
	
	public static void main(String[] args) {
		
		int a= throwingMethod();
		
		System.out.println(a);
	
	}

}
