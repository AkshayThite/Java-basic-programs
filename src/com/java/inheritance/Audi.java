package com.java.inheritance;

public class Audi extends Car {
	
	public Audi(){
		//Super is used to pass values and call super class constructor from child classes
		//Super has to be the first statement the constructor
		//super("AUDI");
		System.out.println("Audi Constructor");
		
		
	}

	public static void main(String[] args) {
		
		Audi audi = new Audi();
		//Car car = new Car();
				
		if(audi instanceof Car){
			
			//System.out.println("Audi is an instance of Car");
			
		}
		
		/*if((car instanceof Audi)){
			
			System.out.println("Audi is NOT an instance of Car");
			
		}
*/

	}

}
