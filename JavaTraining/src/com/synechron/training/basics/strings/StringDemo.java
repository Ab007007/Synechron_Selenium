package com.synechron.training.basics.strings;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str = "ABC";
		String str1 = new String("ABC");
		
		System.out.println(str);
		
		System.out.println("Address of STR "  + str.hashCode());
		System.out.println("Address of STR1 " + str1.hashCode());

		str = str.concat("123");
		
		System.out.println(str);
		System.out.println("Address of STR "  + str.hashCode());
		System.out.println("Address of STR1 " + str1.hashCode());

	
	}

}
