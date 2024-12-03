package com.synechron.training.basics.methods;

public class Addition {
	
	public void add(int a , int b)
	{
		System.out.println("Sum of two numbers is " + (a+b));
	}
	
	
	public void add()
	{
		int a=3;
		int b=3;
		System.out.println("Sum of two numbers is " + (a+b));
	}
	
	public double add(double a, int b)
	{
		double sum = a + b;
		return sum;
	}
	
	public static void main(String[] args) {
		Addition ad = new Addition();
		ad.add();
		ad.add(4, 4);
		double localSum = ad.add(5.0, 7);
		System.out.println("Sum of 3 numbers is  : "  + localSum);
	}
}
