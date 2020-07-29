package com.pratice.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {

		int list[] = {34, 54, 45, 76, 88, 99, 54, 45};
		int len = list.length;
		// Using for loop
		for(int i = 0;i<len;i++)
		{
			for(int j = i+1; j<len;j++)
			{
				if(list[i] == list[j])
				{
				System.out.println("Duplicate Numbers: "+ list[i] );
				}
			}
		}
		
		System.out.println("**********************");
		
		//Using HashSet
		Set<Integer> setnum = new HashSet<Integer>();
		for(Integer numset : list)
		{
			if(setnum.add(numset) == false)
			{
				System.out.println("Duplicate Numbers is: "+ numset);
			}
		}
		
		System.out.println("**********************");
		
		//Using HashMap
		Map<Integer, Integer> maplist = new HashMap<Integer,Integer>();
		for(Integer num1 : list)
		{
			Integer count =  maplist.get(num1);
			if(count == null)
			{
				maplist.put(num1, 1);
			}
			else
			{
				maplist.put(num1,++count);
			}
		}
		
		Set<Entry<Integer, Integer>> setlist = maplist.entrySet();
		for(Entry<Integer, Integer> entryset : setlist)
		{
			if(entryset.getValue()>1)
			{
				System.out.println("Duplicate Numbers: " + entryset.getKey());
			}
		}
		
	}

}
