package com.tnsif.Day_11.V1;

public class UserInterface {
	public static void main(String[] args) {
		try {
			ArrayOperations obj= new ArrayOperations();
			obj.displayArray();
			System.out.println("The element is: "+obj.getElement(2));
			System.out.println("The element is: "+obj.getElement(10));
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println("Error!..."+ ae.getMessage());
		}
		
	}

}
