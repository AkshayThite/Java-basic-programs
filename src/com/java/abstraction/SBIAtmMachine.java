package com.java.abstraction;

public class SBIAtmMachine extends ATM {

	@Override
	public void withdrawMoney(int value) {
		// TODO Auto-generated method stub
		
		if(value >=10000){
			System.out.println("Allow Withdrawal");
		} else {
			System.out.println("Reject Withdrawal");
		}
		
	}

	@Override
	public void depositMoney(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStatement() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]){
		
		
		
	}

}
