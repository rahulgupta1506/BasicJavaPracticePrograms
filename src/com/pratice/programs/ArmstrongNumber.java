package com.pratice.programs;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num)
	{
		int rev =0;
		int cube = 0;
		int temp = num;
		
		while(num>0)
		{
			rev = num % 10;
			num = num / 10;
			cube = cube + (rev * rev * rev);	
		}
		
		if(temp == cube)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
		
	}
	
	
	public static void main(String[] args) {

		isArmstrongNumber(123);
	}

}
