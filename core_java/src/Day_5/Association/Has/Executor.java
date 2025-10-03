package Day_5.Association.Has;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("504 Roman Enclave, Cena Colony", "Nashik", "Japan", "422003");
		Person person = new Person("Virat Kohli", address);
		person.displayInfo();

	}

}
