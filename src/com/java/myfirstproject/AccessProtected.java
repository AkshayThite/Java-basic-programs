package com.java.myfirstproject;

public class AccessProtected extends ProtectedA{

	public static void main(String args[]){
		AccessProtected accessprotected = new AccessProtected();
		System.out.println("Accessed from Same Package: Name"+accessprotected.name);
		System.out.println("Accessed from Same Package: Wealth "+accessprotected.wealth);
		accessprotected.getName();
		accessprotected.getWealth();
	}
	
}
