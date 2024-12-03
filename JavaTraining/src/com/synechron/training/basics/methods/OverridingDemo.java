package com.synechron.training.basics.methods;

import com.synechron.training.basics.variables.Person;

public class OverridingDemo {

	
	/*
	 * write Main method
	 * create person class object
	 * initialize values to the person class
	 * print using S.O.P
	 * 
	 */
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Aravinda";
		p1.age = 80;
		p1.height = 5.8;
		
		Person p2 = new Person();
		p2.name = "ssss";
		p2.age = 81;
		p2.height = 15.8;
		
		System.out.println(p1);
		
		System.out.println(p2);
	}
}
