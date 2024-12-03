package com.synechron.training.basics.access.pack3;

import com.synechron.training.basics.access.pack1.A;

public class C extends A
{

	public static void main(String[] args) {

		C a = new C();
		
		System.out.println(a.protectedMember);
		a.test3();
		
		System.out.println(a.publicMember);
		a.test4();
	}
}
