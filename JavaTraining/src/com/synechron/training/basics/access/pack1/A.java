package com.synechron.training.basics.access.pack1;

public class A {
	
	private int privateMember = 0;
	int defaultMember = 1;
	protected int protectedMember =2;
	public int publicMember = 3;
	
	
	
	private void test1()
	{
		System.out.println("Private Function");
	}
	
	void test2()
	{
		System.out.println("Default Function");
	}
	
	protected void test3()
	{
		System.out.println("protected Function");
	}
	
	public void test4()
	{
		System.out.println("public Function");
	}
	
	public static void main(String[] args) {
		
		
		A a = new A();
		
		System.out.println(a.privateMember);
		a.test1();
		
		
		System.out.println(a.defaultMember);
		a.test2();
		
		System.out.println(a.protectedMember);
		a.test3();
		
		System.out.println(a.publicMember);
		a.test4();
		
		
	}


}
