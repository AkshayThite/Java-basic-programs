package com.java.inheritance;

public class OverridingBaseClass {
	
	public void printStudentDetails(String name, String college, int age, int grade){
		System.out.println("Name "+name+" College "+college+" Age "+age+" Grade "+grade);
	}
	
	public int printAgeOfTheStudent(){
			
		return 22;	
	}
	
	protected int protectedMethod(){
		
		return 22;	
	}
	
	public final int finalMethod(){
		
		return 22;	
	}
	
	public static int staticMethod(){
		
		return 22;	
	}

}
