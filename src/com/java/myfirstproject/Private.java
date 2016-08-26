package com.java.myfirstproject;

 class PrivateClass {

	private int Emp_ID=2;
	private void msg(){System.out.println("Team is awesome");}
	
}

class Private{
	public static void main(String args[]){
		PrivateClass obj = new PrivateClass();
		//obj.msg(); This is not accessible since it is declared private in the class
		//obj.Emp_ID This is not accessible since it is declared private in the class
				
	}
}

