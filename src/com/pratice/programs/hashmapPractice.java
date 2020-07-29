package com.pratice.programs;

import java.util.HashMap;

public class hashmapPractice {

	public static void main(String[] args) {
		
		HashMap<String, testclass> hashmap = new HashMap<String, testclass>();
		
		testclass test1 = new testclass();
		test1.setAge(20);
		test1.setName("Rahul");
		hashmap.put("abc", test1);

		testclass abc = hashmap.get("abc");
		System.out.println(abc.getAge());
	}

}



class testclass
{
	String name = "";
	int age = 0;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}