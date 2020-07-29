package com.pratice.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNames {

	public static void main(String[] args) {

		String names[] = {"Rahul","Sahil","Shilpa","Rahul","Kamal","Sahil"};
		
		// using HashSet
		Set<String> store = new HashSet<String>();
		
		System.out.println("Default list is: "+ Arrays.deepToString(names));
				
		for(String name : names)
		{
			if(store.add(name) == false)
			{
				System.out.println("Duplicate name is: "+ name);
			}
		}
	
	// Using HashMap
	
	Map<String, Integer> mapnames = new HashMap<String, Integer>();
	
	for(String name : names)
	{
			Integer count = mapnames.get(name);
			
			if(count == null)
			{
				mapnames.put(name, 1);
			}
			else
			{
				mapnames.put(name, ++count);
			}	
	}
	
	Set<Entry<String, Integer>> setMap = mapnames.entrySet();
	
	for(Entry<String, Integer> entryset : setMap)
	{
		if(entryset.getValue() > 1)
		{
			System.out.println("Duplicate Element is: " + entryset.getKey());
		}
	}
	
	
	}

}
