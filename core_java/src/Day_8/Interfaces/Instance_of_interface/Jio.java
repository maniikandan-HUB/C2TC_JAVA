package Day_8.Interfaces.Instance_of_interface;

public class Jio implements Phone {
	@Override
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");

	}

}
