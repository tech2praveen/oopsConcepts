package com.cake.addOns;

import com.cake.Interfaces.Cake;

public class BirthdayCake implements Cake,Candles {

	
	@Override
	public void setCandles(int noOfCandles, String color) {
		
	System.out.println(noOfCandles +" candles of "+color+" color.");
	
	}
 

}
