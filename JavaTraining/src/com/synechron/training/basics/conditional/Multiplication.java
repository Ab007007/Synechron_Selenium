package com.synechron.training.basics.conditional;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number ");
		int num = sc.nextInt();

		//String value = generateTable(num);
		//System.out.println(value);

		System.out.println(generateTable(num));
	}

	public static String generateTable(int num) {
		String table = "";
		for (int i = 1; i <= 10; i++) {
			// System.out.println(num + " * " + i + " = " + (num*i));
			table = table + (num + " * " + i + " = " + (num * i) + "\n");
		}

		return table;

	}

}
