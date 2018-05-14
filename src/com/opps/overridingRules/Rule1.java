package com.opps.overridingRules;

/*
 * 
 * The argument list must exactly match that of the overridden method. 
 * If they don’t match, you end up with a overloaded method you didn’t intend.
 * 
 * Here, add method has 2 arguments in base class and 3 arguments in derived class,
 * Hence it acts as an overloaded method.
 */

class Base{
	private int var1;
	private int var2;
	
	protected void add(int var1,int var2)
	{
		this.var1=var1;
		this.var2=var2;
		System.out.println("From base class:"+(var1+var2));
	}
}

class Derived extends Base{
	
	private int var1;
	private int var2;
	private int var3;
	
	protected void add(int var1,int var2,int var3)
	{
		this.var1=var1;
		this.var2=var2;
		this.var3=var3;
		System.out.println("From derived class:"+(var1+var2+var3));
	}
	
}

public class Rule1 {

	public static void main(String[] args) {
		Derived b=new Derived();
		
		b.add(10,20);
		b.add(10, 20,30);
	}

}
