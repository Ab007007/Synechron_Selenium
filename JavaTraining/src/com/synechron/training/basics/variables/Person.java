package com.synechron.training.basics.variables;

public class Person {


		public String name;
		public int age;
		public double height;
		public double weight;
		public static String country = "India";
		public static final boolean isHuman =true;
		
		public Person(String name, int age, double ht, double wt)
		{
			this.name = name;
			this.age = age;
			this.height = ht;
			this.weight = wt;
			
		}
		
		public Person()
		{
//			super();
			System.out.println("Object created with default constructor");
		}
		
		
		public void printPerson()
		{
			System.out.println("Name : " + name);
			System.out.println("Age : " + age);
			System.out.println("Heighe : " + height);
			System.out.println("Weight : " + weight);
			System.out.println("Country : " + Person.country);
				
		}
		
		
		@Override
		public String toString() {
		String personInfo = "Person Name : " + this.name + 
				"\nAge : " + this.age +
				"\nHeight : " + this.height + 
				"\nWeight : " + this.weight +
				"\nCountry : " + country ;
		
		return personInfo;
		}
	}

