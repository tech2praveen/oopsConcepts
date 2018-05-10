package com.cake.main;

import java.util.Scanner;

import com.cake.Interfaces.Cake;
import com.cake.addOns.BirthdayCake;
import com.cake.addOns.ChirstmasCake;
import com.cake.addOns.WeddingCake;





public class Main  {
	
	public static void main(String[] args) {
		
		BirthdayCake bc=new BirthdayCake();
		ChirstmasCake cc=new ChirstmasCake();
		WeddingCake wc=new WeddingCake();
		
		
		
		System.out.println("enter your order: 1:Birthday Cake 2:Christmas Cake 3:Wedding Cake");
		Scanner s=new Scanner(System.in);
		int in=s.nextInt();
		
		
		switch(in )
		{
		case 1: bc.bake();
				bc.frost();
				bc.flavour();
				bc.setCandles(20, "red");
				break;
		case 2: cc.bake();
				cc.frost();
				cc.flavour();
				cc.setMess("Merry Christmas");
				break;
		case 3:wc.bake();
			   wc.frost();
			   wc.flavour();
			   wc.setLayers(3);
			   break;
		default: System.out.println("enter valid input");
		}
		

			
		
		
	}
}
