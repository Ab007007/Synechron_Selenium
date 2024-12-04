package com.synechron.training.basics.strings;

import java.util.Iterator;

public class StringFunctions {
	
	static String emailID = "aru03.info@gmail.com";
	
	public static void main(String[] args) 
	{
		
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
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
			
		}
		
		
	}

}
