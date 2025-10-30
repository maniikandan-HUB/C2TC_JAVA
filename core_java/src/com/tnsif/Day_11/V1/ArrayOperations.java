package com.tnsif.Day_11.V1;

public class ArrayOperations {
	static int performDivision(int x, int y) {
		System.out.println("I am in method");
		int z = 0;
		try {
			System.out.println("I am in try block");
			z = x / y;
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block: " + e.getMessage());
		}
		return z;
	}
	static float performDivision(float a, float b)
	{
		return a/b;
	}
	public void displayArray() {
		// TODO Auto-generated method stub
		
	}
	public String getElement(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
