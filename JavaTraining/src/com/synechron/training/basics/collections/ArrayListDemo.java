package com.synechron.training.basics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.synechron.training.basics.variables.Person;

public class ArrayListDemo {

	
	public static void main(String[] args) {
//		List al = new ArrayList();
//		ArrayList al = new ArrayList();
	
		List al = new LinkedList();
		al.add(123);
		al.add("abcd");
		al.add(23.3);
		al.add(true);
		al.add(new Person("aravind", 33, 33.3, 76));
		
		System.out.println("Size of the array list : " +al.size());
		System.out.println("Reading element from list : " + al.get(0));
		
		System.out.println("Insert element at index 0 : " );
		al.add(0,"A");
		

		System.out.println("Size of the array list : " +al.size());
		System.out.println("Reading element from list : " + al.get(0));
		
		for (int i = 0; i < al.size(); i++)
		{
			//System.out.println("Element at index " + i + "  is " +al.get(i));
			System.out.println(String.format("Element at index %d is %s ", i,String.valueOf(al.get(i))));
			
		}
		
		
		for (Object ele : al) 
		{
//			System.out.println("Element printed using Enhanced For loop : " + ele);
			System.out.println(String.format("Element printed using Enhanced For loop : %s", String.valueOf(ele)));
		}
		
		
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
//			System.out.println("Printing using iterator" + it.next());
			System.out.println(String.format("Printing using iterator %s", String.valueOf(it.next())));
		}
		
	}
}
