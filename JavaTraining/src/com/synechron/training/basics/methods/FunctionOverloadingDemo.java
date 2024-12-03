package com.synechron.training.basics.methods;

public class FunctionOverloadingDemo {
	
	
	
	public static void add(int a , int b)
	{
		System.out.println("Sum of two numbers is " + (a+b));
	}
	
	
	public static void add()
	{
		int a=3;
		int b=3;
		System.out.println("Sum of two numbers is " + (a+b));
	}
	
	public static double add(double a, int b)
	{
		int sum = (int) a + b;
		return sum;
	}
	
	public static void add(double d1, double d2)
	{
		System.out.println("sum of two numbers is " + (d1+d2));
	}
	
	
	public static void add(String s1, String s2)
	{
		System.out.println("sum of two String items " + (s1+22));
	}
	
	public static void add(char c1, char c2)
	{
		char c = (char) (c1 + c2) ;
		System.out.println("Sum of two char " + c);
	}
	
	public static void main(String[] args) {
		add();
		add(4, 4);
		add(3.3,4.4);
		add("Aravinda " , "HB");
		double localSum = add(5.0, 7);
		add('c','d');
		
	//	System.out.println("Sum of 3 numbers is  : "  + localSum);
	}
}
