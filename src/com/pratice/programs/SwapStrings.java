package com.pratice.programs;

public class SwapStrings {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";
		
		a = a+b; // HelloWorld
		
		b = a.substring(0, a.length()-b.length()); // (0 - (10 - 5)) // Hello
		
		a = a.substring(b.length()); // 
		
		System.out.println(a);
		System.out.println(b);
	}

}
