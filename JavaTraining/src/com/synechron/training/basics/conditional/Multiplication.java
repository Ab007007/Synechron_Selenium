package com.synechron.training.basics.conditional;

import java.util.Scanner;

public class Multiplication {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number ");
		int num = sc.nextInt();
		
		for (int i = 1; i <=10 ; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
			
		}
	}
}
