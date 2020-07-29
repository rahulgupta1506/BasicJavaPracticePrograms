package com.pratice.programs;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {

		int numbers[] = {10, 20,-10,-20,30,50};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i =1; i< numbers.length;i++)
		{
			if(numbers[i] > largest)
				{
				largest = numbers[i];
				}
			else if(numbers[i]<smallest)
			{
				smallest = numbers[i];
			}
		}
		
		System.out.println("Given Array is: "+ Arrays.toString(numbers));
		System.out.println("Largest Number is: "+ largest);
		System.out.println("Smallest numbers is: "+ smallest);
	}

}
