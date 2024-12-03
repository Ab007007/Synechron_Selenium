package com.synechron.training.basics.blocks;

public class Test {

	static int x=100;
	static int counter = 1;
	
	{
		System.out.println("calling befor constructor!!!");
		System.out.println("Total objects created to class "  + counter++);
	}
	
	static {
		System.out.println("Executed Before Main" + x);
	}
	
	Test() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor is called");
	}
	
	public static void main(String[] args) {
		System.out.println("main started!!!");
		Test t1 = new Test();
//		
//		for (int i = 0; i < 100; i++) {
//			new Test();
//		}		
		
		System.out.println("main Ended!!!");
	}
	
	
}
