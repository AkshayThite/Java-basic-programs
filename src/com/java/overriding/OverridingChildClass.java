package com.java.overriding;

import com.java.inheritance.OverridingBaseClass;

//RUN-TIME POLYMORPHISM
public class OverridingChildClass extends OverridingBaseClass {

	//signature of the method should remain same with return type
	public void printStudentDetails(String name, String college, int age, int grade){
		System.out.println("Name "+name+" College "+college+" Age "+(age+1)+" Grade "+(grade+1));
	}
	
	//must return the same data type
	public int printAgeOfTheStudent(){
	
		return 22;	
	}
	
	//static methods cannot be overridden
	public static int staticMethod(){
		
		return 44;	
	}
	
	//Visiblity can be INCREASED
	public int protectedMethod(){
		
		return 22;	
	}
	
	//Visiblity can remain the SAME
	/*protected int protectedMethod(){
		
		return 22;	
	}*/
	
	//Visiblity cannot be REDUCED to private
	/*private int protectedMethod(){
	
	return 22;	
	}*/
	
	//Visiblity cannot be REDUCED to default
	/*int protectedMethod(){
	
	return 22;	
	}*/
	
	
	//final method cannot be overridden but can be overloaded
	/*public final int finalMethod(){
		
		return 22;	
	}*/
	
	public static void main(String[] args) {
		
		OverridingChildClass child = new OverridingChildClass();
		child.printStudentDetails("Joshua", "Princeton", 22, 4);
		System.out.println(child.printAgeOfTheStudent());
		

	}

}
