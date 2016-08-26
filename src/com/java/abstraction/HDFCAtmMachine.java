package com.java.abstraction;

public class HDFCAtmMachine extends ATM implements ATM2Ifc {

	@Override
	public void withdrawMoney(int value) {

		if(value >=15000){
			System.out.println("Allow Withdrawal");
		} else {
			System.out.println("Reject Withdrawal");
		}
		
	}

	

	@Override
	public void printStatement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoneyIFC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositMoneyIFC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStatementIFC() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void withdrawMoneyIFC2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositMoneyIFC2() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void depositMoney(int value) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enrollInOffersIFC() {
		// TODO Auto-generated method stub
		
	}

}
