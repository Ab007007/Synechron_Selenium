package com.synechron.training.basics.exceptions;

public class BalanceInsufficientException extends Exception
{
	
	public BalanceInsufficientException() {
		System.out.println("Insufficient Balace !!!!");
	}
	
	public BalanceInsufficientException(int balance) {
		System.out.println("your balance is too low to make the transaction");
		System.out.println("you have " + balance + " in your account");
	}

	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Check Balance Before you do transaction!!!!";
	}
}
