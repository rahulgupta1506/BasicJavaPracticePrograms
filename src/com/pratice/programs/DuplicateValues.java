package com.pratice.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateValues {

	public static void main(String[] args) {

		String nameList[] = { "Rahul","Dhriti","Sahil","Shilpa","Dhriti","Rahul"};
		
		//Using HashSet
		
		Set<String> nameset = new HashSet<String>();
		
		for(String name: nameList)	
		{
			if(nameset.add(name) == false)
			{
				System.out.println("Duplicate name: "+ name);
			}
		}
		
		
		//Using HashMap
		
		Map<String, Integer> mapNames = new HashMap<String, Integer>();
		
		for(String name: nameList)
		{
			Integer count = mapNames.get(name);
			if(count == null)
			{
				mapNames.put(name, 1);
			}
			else
			{
				mapNames.put(name,++count);
			}
		}
		 
		Set<Entry<String, Integer>> setList = mapNames.entrySet();
		
		for(Entry<String,Integer> entryset : setList)
		{
			if(entryset.getValue()>1)
			{
				System.out.println("Duplicate Name is:" + entryset.getKey());
			}
		}
		 
		
		
	}

}
