package com.pratice.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LetterCount {

	public static void main(String[] args) {
		
		String str = "ABACDAED";
		char ch[] = str.toCharArray();
				
		  Map<Character, Integer> setmap = new HashMap<Character, Integer>();
		  
		  for(char ch1 : ch) 
		  
		  { 
			  Integer count = setmap.get(ch1); 
			  if(count == null) 
			  {
				  setmap.put(ch1, 1);
			  } 
			  else
			  {
				  setmap.put(ch1, ++count);
			  }
		  }
		  
		  Set<Entry<Character, Integer>> sethash = setmap.entrySet();
		 
		  for(Entry<Character, Integer> ch2 : sethash)
		  {
			  System.out.println(ch2.getKey()+" "+ ch2.getValue());
		  }
	}
}
