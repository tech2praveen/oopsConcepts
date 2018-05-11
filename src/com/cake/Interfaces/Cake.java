package com.cake.Interfaces;

public interface Cake {
	
	 default void bake()
	 {
		 System.out.println("Baking the cake");	
	 }
	 default void frost()
	 {
		 System.out.println("frosting the cake");
	 }
	 default void flavour()
	 {
		 System.out.println("flavouring the cake ");
	 }
	 
}
