package com.synechron.training.basics.conditional;

import java.util.Scanner;

public class GreaterNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Third Number :");
		int num3 = sc.nextInt();
		
		if(num1> num2  && num1>num3) {
			System.out.println(num1 + "is the largest number");
		}
		else if(num2 >num1 && num2 > num3) {
			System.out.println(num2 + "is the largest number");
				
		}
		else if(num3 > num1 && num3 >num2)
		{
			System.out.println(num3 + "is the largest number");
			
		}
		else
		{
			System.out.println("atleast Two number are idetical");
		}
		
		
	}

}
