package com.java.myfirstproject;

public class OverloadingExample {

	//Final keyword for declaring constant values
	public final String name1 = "John Doe";
	public final int age = 10;
	
	public final void displayName(){
		
		System.out.println("Name value "+name1);
		
	}
	
	public void displayName(String name){
		
		//<,>,<=,>=,==,!=
		if(name=="John"){
			System.out.println("TRUE");
			System.out.println(name);
		}
		
		
		else if(name=="John Doe"){
			System.out.println("TRUE");
			System.out.println(name);
			
		}
		else if(name=="Michael"){
			System.out.println("TRUE");
			System.out.println(name);
			
		}
		else{
			System.out.println("FALSE");
			System.out.println(name);
		}
			
	}
	
	public void displayName(String name, int age){
		
		//System.out.println("Method with one String and one int argument");
		
		switch(name){
		case "John":
			System.out.println("JOHN");
			break;
		case "John Doe":	
			System.out.println("JOHN DOE");
			break;
		case "Michael":	
			System.out.println("MICHAEL");
			break;
		default:
			System.out.println("FALSE");
			break;
		}
	}
	
	public void displayName(int age, String name){
		
		System.out.println("Method with one int and one String argument: sequence changed");
		
	}
	
	public String displayName(String name, String Student){
		
		System.out.println("Method with two String arguments");
		
		return "";
		
	}
	
	public int displayName(String name, String Student, float x){
		
		System.out.println("Method with two String arguments");
		
		return 0;
		
	}
	
	//Object overloading
	public void forLoop(){
		
		for(int i=0;i<=10;i++){
			System.out.println("For: Value of i is "+i);
		}
		
	}
	
	public void whileLoop(){
		
		int i = 1;
		while(i<=10){
			System.out.println("While: Value of i is "+i);
			i++;
		}
		
	}
	
	public void doWhileLoop(){
		
		int i = 11;
		do{
			
			System.out.println("While: Value of i is "+i);
			i++;
			
		}
		while(i<=10);
			
		
		
	}
	
	public void displayName(AccessDefault access){
		
	}
	
	//OVERLOADING: COMPILE TIME POLYMORPHISM
	//DEPENDS ONLY UPON ARGUMENT TYPES
	//SEQUENCE OF ARGUMENT TYPES
	//DOES NOT DEPEND UPON RETURN TYPES
	//FINAL METHODS CAN BE OVERLOADED
	
	
	public static void main(String[] args) {
		
		OverloadingExample obj = new OverloadingExample();
		//obj.displayName();
		//obj.displayName("Jackson");
		//obj.displayName("Michael2", 32);
		//obj.displayName(32,"John Doe");
		//obj.displayName("","John Doe");
		obj.doWhileLoop();
		

	}

}
