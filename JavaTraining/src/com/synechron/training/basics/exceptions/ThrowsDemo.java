package com.synechron.training.basics.exceptions;

public class ThrowsDemo {
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		test1();
		System.out.println("Main Ended");
	}
	
	public static void test1()
	{
		try {
			test2();
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
	
	public static void test2() throws NullPointerException, StringIndexOutOfBoundsException
	{
			String str= "";
			System.out.println(str.length());
			System.out.println(str.indexOf("a"));
			System.out.println(str.charAt(2));
		
	}

}
