package com.java.inheritance;

public class StudentInfo {

	int Student_ID;
	String Student_name;

	public StudentInfo() {
		System.out.println("Student Information will be displayed");
		Student_ID = 100;
		Student_name = "DART";
	}

	// Method
	public void getStudentID() {
		System.out.println("Student ID is " + Student_ID);
	}

	public void getStudentName() {
		System.out.println("Name of the student is " + Student_name);

	}

}
