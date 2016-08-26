package com.java.myfirstproject;

public class Bike {

	private int TotalGears;
	private String Bike_Color;
	private int MaxSpeed;
	private String Bike_Name;

	public Bike() {
		System.out.println("Description of Bike will be displayed");
		TotalGears = 5;
		Bike_Color = "Red";
		MaxSpeed = 220;
		Bike_Name = "YamahaFZ";

	}
	
	public Bike(int TotalGears, String Bike_Color, int MaxSpeed, String Bike_Name) {
		System.out.println("Example of OVERLOADED CONSTRUCTOR");
		this.TotalGears = TotalGears;
		this.Bike_Color = Bike_Color;
		this.MaxSpeed = MaxSpeed;
		this.Bike_Name = Bike_Name;

	}


	public void getTotalGears() {
		System.out.println("Total number of gears is " + TotalGears);

	}

	public void getBikeColor() {

		System.out.println("Color of the bike is " + Bike_Color);
	}

	public void getMaxSpeed() {
		System.out.println("Maximum speed of the bike is " + MaxSpeed);

	}

	public void getBikeName() {
		System.out.println("Name of the Bike is "+ Bike_Name);
		
		
	}
}
