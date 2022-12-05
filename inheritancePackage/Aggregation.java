package inheritancePackage;

class Address {
	String city;
	String state;
	String country;

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Student {
	int id;
	String name;
	int age;
	Address add;

	public Student(int id, String name, int age, Address add) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.add = add;
	}

	public void display() {
		System.out.println("My name is: " + name + " id is " + id + " of age " + age + "and I am from " + add.city
				+ ", " + add.state + ", " + add.country + ".");
	}
}

public class Aggregation {

	public static void main(String[] args) {

		Address add = new Address("Kathmandu", "Bagmati", "Nepal");
		Student st = new Student(1, "Jargha", 22, add);
		st.display();

	}

}
