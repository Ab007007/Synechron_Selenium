package com.synechron.training.basics.collections;

import java.util.ArrayList;
import java.util.List;

import com.synechron.training.basics.variables.Person;

public class GenericsDemo {
	
	public static void main(String[] args) {
		
		List<Person> al = new ArrayList();
		
		List<Integer> intObj = new ArrayList<Integer>();
		
		intObj.add(22);
		intObj.add(22);
		intObj.add(22);
		intObj.add(22);
		intObj.add(22);
		intObj.add(22);
		
		
 		
		al.add(new Person());
		al.add(new Person("abc", 22, 22.2, 33.3));
		
		//System.out.println(al);
		
		for (Person person : al) {
			System.out.println(person);
		}
	}

}
