package com.pratice.programs;

public class FactorialNumber {

//	public static int factor(int num)
//	{
//		int fact = 1;
//		if(num == 0)
//		{
//			return 1;
//		}
//		
//		for (int i =1 ; i <= num ; i++)
//		{
//			fact = fact * i;
//		}
//		
//		return fact;
//	}
	
	
	public static int factor(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return (num * factor(num-1));
		}
	}
	
	public static void main(String[] args) {

		System.out.println(factor(5));
	}

}
