package com.synechron.training.basics.exceptions;

import java.util.Scanner;

public class WithdrawMoney {
	static Scanner sc = null;
	static int balance = 50000;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		String continueTransaction = null;
		do {
			System.out.println("Welcome to Banking Applicaiton!!!!");
			System.out.println("What do you want to perform!!");
			System.out.println("1. Check Balance\n2. Amount Withdraw\n3. Deposit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Your Account Balance is " + balance);
				break;
			}
			case 2: {
				System.out.println("Enter the amount you want to withdraw");
				int amount = sc.nextInt();
				int tempBalance = balance - amount;
				if (tempBalance <= 0) {
					try {
						throw new BalanceInsufficientException(balance);
					}
					catch(BalanceInsufficientException ex)
					{
						System.out.println(ex.getMessage());
					}
					catch (Exception e) {
						System.out.println("Exception occured");
					}
//					throw new Exception();
				} else {
					balance = tempBalance;
				}
				System.out.println("your New Balance is " + balance);
				break;
			}
			case 3: {
				System.out.println("How much you want to deposit");
				int amount = sc.nextInt();
				System.out.println("your previous balance was " + balance);
				balance = balance + amount;
				System.out.println("New Balance after deposit of" + " Rs. " + amount + " is " + balance);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

			System.out.println("Do you want to continue, Y / N");
			continueTransaction = sc.next();

		} while (continueTransaction.equalsIgnoreCase("y"));
		
		System.out.println("Thank you for using App");
	}

}
