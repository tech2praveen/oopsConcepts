package com.opps.ConstructorPractice;

class Super {

	Super() {
		System.out.println("Default constructor called");
	}

	Super(int x) {
		this();
		System.out.println("Super class constructor");
	}
}

class Sub extends Super {
	int y;

	Sub(int x) {
		super(x);
		y = x;
		System.out.println("Sub class contructor");
	}

	Sub(int x, int y) {
		this(x);
		System.out.println("Sub class contructor");
	}
}

public class ConstructRules {
	public static void main(String[] args) {

		Super s1 = new Super(10);
		 Sub s=new Sub(10,20);
	}

}
