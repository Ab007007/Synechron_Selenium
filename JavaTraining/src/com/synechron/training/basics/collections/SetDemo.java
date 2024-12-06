package com.synechron.training.basics.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
//		Set s = new HashSet();
//		Set s = new LinkedHashSet();
		
		Set s = new TreeSet();
		s.add(123);
		s.add(444);
		s.add(111);
		s.add(999);
		
		System.out.println("Element in Set " + s.size());	
		
		s.add(999);
		s.add(111);
		
		System.out.println("Element in Set " + s.size());
		
		for (Object object : s) {
			System.out.println(object);
		}
		
		
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(String.format("Element in Set %s", String.valueOf(it.next())));
		}
	}

}
