package inheritancePackage;


class Employee{ //super/parents class
	int id;
	String name;
	float salary;
}

class Developer extends Employee{ //child class
	float bonus;
	void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Total Salary : " + (salary+bonus) );
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		Developer emp = new Developer();
		emp.id = 1011;
		emp.name = "Krishna";
		emp.salary = 40000.244f;
		emp.bonus = 5000;
		emp.display();

	}

}
