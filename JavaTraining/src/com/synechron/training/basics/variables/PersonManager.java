package com.synechron.training.basics.variables;

public class PersonManager
{

	static Person p1,p2,p3;
	
	public static void main(String[] args) 
	{
		p1 = new Person();
		p1.name = "aravinda";
		p1.age = 80;
		p1.height = 5.8;
		p1.weight = 76;
		p1.country = "Austrila";
		p1.printPerson();
		
		
		p2 = new Person();
		p2.name = "xyz";
		p2.age = 80;
		p2.height = 5.8;
		p2.weight = 76;
		p2.country = "Pakistan";
		p2 = new Person();
		p2.printPerson();
		
		
		p3 = new Person("Hary", 40, 5.2, 85);
		p3.printPerson();
		
		
		test();
		
	
	}
	
	public static void test()
	{
		p1.printPerson();
		p2.printPerson();
		p3.printPerson();
	}
}


