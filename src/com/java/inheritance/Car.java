package com.java.inheritance;

public class Car extends SuperCar {

	public int MAX_GEARS;
	public int MAX_Speed;
	
	public Car() {
		System.out.println("Car Constructor");
		MAX_GEARS = 7;
		MAX_Speed = 320;
	}
	
	public Car(String name) {
		
		System.out.println("CAR "+name+" instantiated");
		
	}

	public void getMaxGears() {
		System.out.println("Maximum Gears are " + MAX_GEARS);

	}

	public void getMaxSpeed() {
		System.out.println("Maximum Speed is " + MAX_Speed);

	}

}
