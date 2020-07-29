package com.pratice.programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		isNumberPalindrome(12156);
	}

	
	public static void isNumberPalindrome(int num)
	{
		int rev =0;
		int sum =0;
		int temp;
		temp = num;
		
		
		while(num>0) {
			
			rev = num % 10;
			sum = (sum * 10) + rev;
			num = num / 10;
			}
		
		if (temp == sum)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
		
	}
}
