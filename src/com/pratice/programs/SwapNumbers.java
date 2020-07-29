package com.pratice.programs;

public class SwapNumbers {

		public static void main(String[] args) {

		int x =20;
		int y =30;
		//int z =0;
		
		// Using third variable
//		  z = x; 
//		  x = y; 
//		  y = z;
		  
		// Without 3rd variable with + operator
		
//		  x = x+y; //50 
//		  y = x-y; //30 
//		  x = x-y; //20
		  
		// Without 3rd variable with * operator
		
//		x = x * y;//600
//		y = x / y;//20
//		x = x / y;//30
		
		// With XOR operator
		
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println(x); 
		System.out.println(y);
	}

}
