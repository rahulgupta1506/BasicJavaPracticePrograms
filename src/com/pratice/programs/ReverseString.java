package com.pratice.programs;

public class ReverseString {

	public static void main(String args[])
	//1st 
	/*{
		String name ="Rahul";
		for(int i= name.length()-1; i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}*/
	
	//2nd
	
	/*{
		String name ="Rahul Gupta";
		char[] wordArray = name.toCharArray();
		for(int i= wordArray.length-1; i>=0;i--)
		{
			System.out.print(wordArray[i]);
		}
	}*/
	
	//3rd
	/*{
		String name ="Rahul Gupta";
		String[] arrstr= name.split(" ");
		
	for(int i= 0;i< arrstr.length;i++)
	{
				String s1 = arrstr[i];
		for(int j = s1.length()-1;j>=0;j-- )
		{
			System.out.print(s1.charAt(j));
			
		}
		System.out.print(" ");
	}
	}*/
	
	//4th 
	/*{
		String name ="Rahul Gupta";
		String[] arrstr= name.split(" ");
		for(int i= 0;i< arrstr.length;i++)
		{ 
			String s2 = arrstr[i];
			char[] c1 = s2.toCharArray();
			
			for(int j= c1.length-1;j>=0;j--)
			{
				System.out.print(c1[j]);
			}
			System.out.print(" ");
		}
	}*/
	
	//5th
	
/*	{
		String name = "Rahul";
		
		char[] namearr = new char[name.length()];
		 
		for(int i = name.length()-1; i>=0;i--)
		{     
			namearr[name.length()-i-1] = name.charAt(i);
		}
		String reverse_name = String.valueOf(namearr);
		System.out.println(reverse_name);
	}*/
	
	
	  //6th Method
	  
	{
		String name = "Rahul";
		String reverse_string = "";
		for (int i = name.length()-1; i >= 0; i--) {
			reverse_string = reverse_string + name.charAt(i);
		}
		System.out.println(reverse_string);
	}
	 
}
