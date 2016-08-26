package com.java.myfirstproject;

public class FirstJavaClass {
	
	//static StudentInfo studentinfo;
static Bike bike;

	public static void main(String[] args) {
		
		/*car = new Car();
		
		car.getMaxGears();
		car.getMaxSpeed();
		*/	
		


		/*studentinfo = new StudentInfo();
		studentinfo.getStudentID();
		studentinfo.getStudentName();*/
		//int TotalGears, String Bike_Color, int MaxSpeed, String Bike_Nam
		bike = new Bike(6, "Green", 120, "Yamaha RX100");
		bike.getBikeColor();
		bike.getBikeName();
		bike.getMaxSpeed();
		bike.getTotalGears();
	
	
	}

}
