package inheritancePackage;

abstract class Car {
	final int wheels = 4;

	public Car() {
		System.out.println("Car Constructor");
	}

	public void VehicleType() {
		System.out.println("Type: Car");
	}

}

abstract class Maruti extends Car { // Sub class of car
	public Maruti() {
		System.out.println("Maruti Constructor");
	}

	public void brand() {
		System.out.println("Brand: Suzuki");
	}

	public void speed() {
		System.out.println("80km/hr");
	}
}

class Maruti800 extends Maruti { // Sub class of maruti
	public Maruti800() {
		System.out.println("Maruti800 Constructor");
	}

	@Override // annotation
	public void speed() {
		System.out.println("85km/hr");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Maruti800 car = new Maruti800();
		car.VehicleType();
		car.brand();
		car.speed();// calls overridden method
		System.out.println("No.of wheels=" + car.wheels);

	}

}
