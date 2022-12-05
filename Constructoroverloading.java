
class Shapes {
	int length, breath;
	float radius;

	// constructor overloading

	public Shapes(int length) {
		this.length = this.breath = length;
	}

	public Shapes(int length, int breath) {
		this.length = length;
		this.breath = breath;
	}

	public Shapes(float radius) {
		this.radius = radius;
	}

	public int area() {
		return length * breath;
	}

	public float areaC() {
		return (float) Math.PI * radius * radius;
	}
}

public class Constructoroverloading {

	public static void main(String[] args) {
		Shapes rect = new Shapes(5, 6);// calls constructor(2 par)
		System.out.println("Area of rectangle:" + rect.area());
		Shapes square = new Shapes(5);
		System.out.println("Area of square:" + square.area());
		Shapes circle = new Shapes(23.45f);
		System.out.println("Area of circle:" + circle.areaC());
	}

}
