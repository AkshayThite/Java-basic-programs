package com.java.myfirstproject;

public class StaticExample {
	
	static int classVariable = 0;
	int instanceVariable = 0;
	
	static int roll = 10;
	static String name = "John Doe";
	static String college  = "University of Pennyslvania";
	
	public StaticExample(){
		
		
		classVariable++;
		instanceVariable++;
		//Printing Instance and Class Variables:
		System.out.println("Value of Static Var is "+classVariable);
		System.out.println("Value of Instance Var is "+instanceVariable);
	}
	
	public static void anExampleStaticMethod(){
		
		System.out.println("Calling from Static Method !!");
		System.out.println(roll+" "+name+" "+college);
		
	}

	public static void main(String[] args) {
		
		
		StaticExample obj1 = new StaticExample();
		StaticExample obj2 = new StaticExample();
		StaticExample obj3 = new StaticExample();
		StaticExample obj4 = new StaticExample();
		StaticExample obj5 = new StaticExample();
		StaticExample obj6 = new StaticExample();
		
		StaticExample.anExampleStaticMethod();
		
		System.out.println("Accessing Instance Variable "+obj1.instanceVariable);
		System.out.println("Accessing Class Variable "+StaticExample.classVariable);
		

	}

}
