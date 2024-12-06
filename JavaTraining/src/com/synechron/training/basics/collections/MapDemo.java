package com.synechron.training.basics.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args)
	{
		Map mp = new TreeMap();
//		Map mp = new LinkedHashMap();
//		Map mp = new HashMap();
		
		mp.put("name", "aravinda");
		mp.put("age", 30);
		mp.put("address", "Bangalore");
		mp.put("phone", 123344);
		
		System.out.println(String.format("Total elements in Map is %d", mp.size()));
	
		System.out.println(mp.get("name"));
		
		mp.put("name", "aravinda123");
		
		System.out.println(mp.get("name"));
		
		
		Set keys = mp.keySet();
		
		for (Object key : keys) {
//			System.out.println(String.format("Keys in collection %s ",key));
			System.out.println(key + " : " + mp.get(key));
		}
	
		System.out.println("\n***************\nMap Values using Iterator!!!\n************\n");
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			System.out.println(mp.get(it.next()));
		}  
		
		
		System.out.println(mp);
		
		
		
		
		
		
	}

}
