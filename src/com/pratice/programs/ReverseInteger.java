package com.pratice.programs;

public class ReverseInteger {

	public static void main(String[] args) {

		long num = 1234567895;
		long rev = 0;
		long temp = num;
		
		while(temp != 0)
		{
			rev = rev * 10 + temp %10;
			temp = temp/10;
		}
		System.out.println(rev);
	
		int num1 = 1234567890;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
	
	if(rev == num)
	{
		System.out.println("Number is palindrome");
	}
	else
	{
		System.out.println("Number is not palindrome");
	}
}
}
