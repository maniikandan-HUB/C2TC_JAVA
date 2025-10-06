package com.tnsif.Day_6.Using_final;

public class FinalMethodDemo {
	FinalMethodDemo() {
		System.out.println("This is a default constructor");
	}

	final int a = 50;

	// Final method
	final void show() {
		System.out.println("Value of a: " + a);
	}

}
