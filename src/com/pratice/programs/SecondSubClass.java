package com.pratice.programs;

public class SecondSubClass extends FirstSuperClass {

	public void test1method() {
		System.out.println("Test4 Method");
	}
	
	public static void main(String[] args) {

		SecondSubClass ssc = new SecondSubClass();
		ssc.test1method();
		ssc.test2method();
		ssc.test3method();
	}

}
