package com.pratice.programs;

public class ManipulationString {

	public static void main(String[] args) {
		String str = "The rains have started heres";
		String str1 = "The rains Have started heres";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('s',str.indexOf('s')+1));
		
		System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)+1));
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("Hello")); // -1
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(4, 9));
		
		String s = "      Hello world     ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		String name = "Test_Data_selenium_Testing";
		String arr[] = name.split("_");
		for(int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String p = "Test";
		System.out.println(p.concat("s"));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(a+x+y+b);
		System.out.println(x+y+(a+b));
		
	}

}
