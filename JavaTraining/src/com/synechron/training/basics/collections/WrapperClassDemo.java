package com.synechron.training.basics.collections;

import java.util.*;

public class WrapperClassDemo {
	
	public static void main(String[] args) {
		
		
		String age = "40";
		String height = "5.8";
		
		int ageInInteger = Integer.valueOf(age);
		double heightInDouble = Double.valueOf(height);
		
	
		String aboutMe = "The universe is all of space and time[a] and their contents.[10] It comprises all of existence, any fundamental interaction, physical process and physical constant, and therefore all forms of matter and energy, and the structures they form, from sub-atomic particles to entire galactic filaments. Since the early 20th century";
		
		String[] splittedWords = aboutMe.split(" ");
		
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<splittedWords.length;i++) {
			if(map.containsKey(splittedWords[i]))
			{
				map.put(splittedWords[i], map.get(splittedWords[i])+1);
			}
			else
			{
				map.put(splittedWords[i], 1);				
			}
//			map.put(splittedWords[i],map.getOrDefault(splittedWords[i], 0)+1);
		}
		
		Set<String> keys = map.keySet();
		
		Iterator<String> it = keys.iterator();
		String key;
		
		while(it.hasNext())
		{
			key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
//		System.out.println(map.entrySet());
		
		
		
		
		
//		if(ageInInteger >=18)
//			System.out.println("drive sage");
//		else
//			System.out.println("sit back and relax");
	}
	

}
