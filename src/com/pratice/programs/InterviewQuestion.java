package com.pratice.programs;

public class InterviewQuestion {

	int t1 = 10;
	static int t2 = 20;
	
	public static void main(String[] args) {
		InterviewQuestion t3 = new InterviewQuestion();
		InterviewQuestion t4 = new InterviewQuestion();
		t3.t1 = t3.t1+10;
		t3.t2 = t3.t2+10;
		
		System.out.println(t4.t1);
		System.out.println(t4.t2);
		
		
	}

}
