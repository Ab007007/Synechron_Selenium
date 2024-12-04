package com.synechron.training.basics.exceptions;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		test1();
		System.out.println("Main Ended");
	}
	
	public static void test1()
	{
		test2();
	}
	
	public static void test2()
	{
		try {
			String str= "";
			System.out.println(str.length());
			System.out.println(str.indexOf("a"));
			System.out.println(str.charAt(2));
		}
		catch (NullPointerException e) {
			System.out.println("Exception occured !!!" + e.getMessage());
			// TODO: handle exception
		}
		catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
