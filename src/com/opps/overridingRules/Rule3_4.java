package com.opps.overridingRules;


class Vehicle {

   protected void Accelerate() {
	   System.out.println("Vehicle is accerating");
   }

    public void Brake(){
    	System.out.println("Vehicle is Braking");
    }
}

class  Car extends Vehicle {
	
	/*
	 * The access level CAN be less restrictive than that of the overridden method.
	 * Accelerate is protected in Vehicle class and public in derived.
	 */
	
		@Override
		public void Accelerate() {
			System.out.println("Car is accerating");
		}

  /*
   * The access level can’t be more restrictive than the overridden method.
   * Brake method is public in Vehicle class, it cannot be protected or private in Derived class i.e. Car class.
   */
		
		//protected void Brake()  {}
	
}

public class Rule3_4 {

	public static void main(String[] args) {
		Vehicle c=new Car();
		
		c.Accelerate();
		c.Brake();
		
	}

}
