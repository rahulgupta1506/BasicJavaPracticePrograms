package com.pratice.programs;

import java.util.Scanner;

public class PrintAnInteger {

	public static void main(String[] args) {

		Scanner enternum = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = enternum.nextInt();
		System.out.println("Your Entered number is: "+ num);
	}

}
