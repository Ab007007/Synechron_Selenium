package com.synechron.training.basics.strings;

public class StringBufferDemo {

	static String emailID = "aru03.info@gmail.com";
//	static String emailObj1 = new String("Aru03.info@gmail.com");

//	static String employeeDetails1 = "Name=Aravinda;EmployeeID=EMP123;Company=Synechron;Location=Bangalore";

	public static void main(String[] args) {

//		StringBuffer sb = new StringBuffer(emailID);
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.append("ABCD"));
		System.out.println(sb.hashCode());

		sb.charAt(0);
		sb.indexOf("a");
		sb.length();
		sb.substring(0, 10);
		sb.equals(sb);
		// sb.reverse();
		sb.replace(sb.indexOf("@") + 1, sb.length(), "yahoo.com");
		System.out.println(sb);
	}

}
