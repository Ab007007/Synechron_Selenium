package com.synechron.training.basics.access.pack1;

public class Z {
	
	public static void main(String[] args) {

		A a = new A();
		
		System.out.println(a.defaultMember);
		a.test2();
		
		System.out.println(a.protectedMember);
		a.test3();
		
		System.out.println(a.publicMember);
		a.test4();
	}

}
