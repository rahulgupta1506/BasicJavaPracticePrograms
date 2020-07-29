package com.pratice.programs;

public class BeforeMainMethod {

	static {
		
		System.out.println("Static block");
	}
	
	
	public static void main(String[] args) {

		System.out.println("Main method");
	}

}
