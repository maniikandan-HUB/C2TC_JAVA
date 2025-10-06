package com.tnsif.Day_7.Overriding.V1;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[3];

	
		shapes[0] = new Circle(5.0);
		shapes[1] = new Triangle(4.0, 3.0);
		shapes[2] = new Square(6.0);

		
		for (Shape shape : shapes) {
			shape.draw();
			shape.erase();
			System.out.println("------------------------------"); 
		}

	}

}
