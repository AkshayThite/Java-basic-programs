package com.java.inheritance;

public class Junior extends StudentInfo {

	public static void main(String[] args) {

		Junior junior = new Junior();
		StudentInfo studentinfo = new StudentInfo();

		if (junior instanceof StudentInfo) {

			System.out.println("Junior is an instance of StudentInfo");

		}

		if (!(studentinfo instanceof Junior)) {

			System.out.println("Student is an instance of Junior");
		}

	}
}