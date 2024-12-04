package com.synechron.training.basics.strings;

import java.util.Iterator;

public class StringFunctions {
	
	static String emailID = "aru03.info@gmail.com";
	static String emailObj = new String("Aru03.info@gmail.com");
	
	static String employeeDetails= "Name=Aravinda;EmployeeID=EMP123;Company=Synechron;Location=Bangalore";
	
	public static void main(String[] args) 
	{
		String[] employeeArray=employeeDetails.split(";");
		for(int i=0;i<employeeArray.length;i++)
		{
			System.out.println(employeeArray[i].split("=")[1]);
		}
	
		System.out.println("using substring *******************************");
		for(int i=0;i<employeeArray.length;i++)
		{
			
			System.out.println(employeeArray[i].substring
					(employeeArray[i].indexOf("=")+1, employeeArray[i].length()));
		}
		
		
		
		for(String str:employeeArray)
		{
			System.out.println(str);
		}
		
		System.out.println("Index of char a  :  " + emailID.indexOf("a"));
		//System.out.println("Index of char a  :  " + emailID.indexOf("Z"));
		
		
		System.out.println("Last index of char a : " + emailID.lastIndexOf("a"));
		
		if(emailID.indexOf("@") == emailID.lastIndexOf("@"))
			System.out.println("Valid Email id");
		else
			System.out.println("Invalid email first index is " + emailID.indexOf("@") + " and " +emailID.lastIndexOf("@") );
		
		
		System.out.println("Char At a given index 0 : " + emailID.charAt(0));
		System.out.println("Char At a given index 10: " + emailID.charAt(10));
		System.out.println("Char At a given index 12 : " + emailID.charAt(12));
		
		System.out.println("Lenght of a string : " + emailID.length());
		
		String[] strings = emailID.split("@");
		
//		for (int i = 0; i < strings.length; i++) {
//			System.out.println(strings[i]);
//			
//		}
		
		System.out.println(strings[1].substring(0, strings[1].indexOf(".")));
		
		System.out.println(emailID.toUpperCase());
		System.out.println(emailID.toLowerCase());
		System.out.println("EQUALS " + emailID.equals(emailObj));
		System.out.println("EQUALSIGNORECASE " + emailID.equalsIgnoreCase(emailObj));
		
		
		System.out.println(emailID.endsWith(".com"));
		
		System.out.println(emailID.startsWith("a"));
		
		//String age = "40";

		
		
	}

}
