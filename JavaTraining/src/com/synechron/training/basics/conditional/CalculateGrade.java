package com.synechron.training.basics.conditional;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = null;
		
		do {
			System.out.println("Enter the GRADE : please enter A-D or a-d ");
			String grade = sc.next();
			
			switch (grade.toUpperCase()) {
			case "A": {
				System.out.println("Your score is above 90");
				break;
			}
			case "B": {
				System.out.println("Your score is above 80");
				break;
			}
			case "C": {
				System.out.println("Your score is above 70");
				break;
			}
			case "D": {
				System.out.println("Your score is above 60");
				break;
			}
			default:
				System.out.println("Invalid Grade!!! May be Fail!!!");
			}
			System.out.println("Do you want to continue .. Press Y/y");
			choice = sc.next();
		} while (choice.toUpperCase().equals("Y"));
		
		System.out.println("Thank you for using grade program!!!");
		


	}

}
