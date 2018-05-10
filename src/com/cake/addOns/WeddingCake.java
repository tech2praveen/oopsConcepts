package com.cake.addOns;

import com.cake.Interfaces.Cake;

public class WeddingCake implements Cake,Layers{

	@Override
	public void setLayers(int n) {
		System.out.println("With "+n+" layers");
	}
	
	
	
}
