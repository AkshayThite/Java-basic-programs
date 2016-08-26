package com.java.second;

import com.java.myfirstproject.ProtectedA;

public class AccessProtected extends ProtectedA {

	public static void main(String args[]) {
		AccessProtected accessprotected = new AccessProtected();
		System.out.println("Accessed from Different Package: Name " + accessprotected.name);
		System.out.println("Accessed from Different Package: Wealth " + accessprotected.wealth);
		accessprotected.getName();
		accessprotected.getWealth();
	}
}