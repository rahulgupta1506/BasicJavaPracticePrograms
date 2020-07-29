package com.pratice.programs;

public class FinallyConcept {

	public static void main(String[] args) {

		test1method();
	}

	
	public static void test1method()
	
	{ 
		int i = 5;
		String abc[] = {"a","b","c","d"};
		try 
		{
			System.out.println("Inside try1 block");
			int x = i/0;
			System.out.println("Inside try2 block");
			System.out.println(abc[7]);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Inside catch1 block");
		}
		catch(ArithmeticException e2)
		{
			System.out.println("Inside catch3 block");
		}
		catch(NullPointerException e3)
		{
			System.out.println("Inside catch2 block");
		}
		
		catch(Exception e3)
		{
			System.out.println("Inside catch2 block");
		}
		
		catch(Throwable e3)
		{
			System.out.println("Inside catch2 block");
		}
		
		finally 
		{
			System.out.println("Inside finally block");
		}
	}

	public static void test2method()
	{
		try {
			    
			try {}
			catch(Exception e1) {}
			finally{}
			
		}
		catch(Exception e)
		{
			try {}
			catch(Exception e2) {}
			finally{}
		}
		
		finally {
			
			try {}
			catch(Exception e3) {}
			finally{}
		}
	}
	



}
