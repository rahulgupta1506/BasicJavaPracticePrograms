package com.pratice.programs;

public class ConstructorPractice {

	int id;
	String name;
	public ConstructorPractice()
	{
		System.out.println("Hello");
	};
	void display()
	{
		System.out.println(id+" "+name);
		}
	
	
	public static void main(String[] args) {
		
		
		ConstructorPractice s1=new ConstructorPractice();
		ConstructorPractice s2=new ConstructorPractice();
		s1.display();
		s2.display();
		}

	}

