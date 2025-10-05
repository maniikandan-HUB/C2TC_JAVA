package Day_7.Overloading;

public class Overloading_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("------------------------ Constructor Overloading -----------------------");
		
		Point p = new Point(); 
		System.out.println(p);

		Point p1 = new Point(14.5f); 
		System.out.println(p1);

		Point p2 = new Point(12.5f, 20.50f); 
		System.out.println(p2);

		System.out.println("------------------------ Method Overloading -----------------------");
		System.out.println("Addition of two integers : " + Method_Overloading.addition(10, 20));
		System.out.println("Addition of two floating numbers :" + Method_Overloading.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float :" + Method_Overloading.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer :" + Method_Overloading.addition(10.0f, 20));
		System.out.println("Addition of two Strings : " + Method_Overloading.addition("Hello ", "World"));

	}

}
