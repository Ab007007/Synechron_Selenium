package com.synechron.training.basics.conditional;

import java.util.Scanner;

public class VerifyDL {
	
	/*
	 * Write a program to verify DL - if age above 18 person has DL
	 * 
	 * 
	 * 
	 * Write a program to verify largest of 3 Numbers
	 * 
	 * 
	 * 
	 * Write a program to assign the Grade of a Student
	 * 
	 * Grade A - score is above 90
	 * Grade B - score is above 80
	 * Grade C - score is above 70
	 * Grade D - score is above 60
	 */
	
	
	private static int age ;
	 
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the AGE : ");
		age = sc.nextInt();
//		age = 12;
		System.out.println("User entered age is " + age);
		if (age < 18)
		{
			System.out.println("Your Age is " + age + " you need to wait " + (18-age) + " more years to drive");
		} 
		else if (age >=70)
		{
			System.out.println("You are Elder .. Please stop driving");
		}
		else
		{
			System.out.println("You have a valid DL");
		}
		
	}
	

}
