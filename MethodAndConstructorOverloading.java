
class Shape {
	int length, breath;
	float radius;

	// method oberloading

	public void setData(int length) {
		this.length = this.breath = length;
	}

	public void setData(int length, int breath) {
		this.length = length;
		this.breath = breath;
	}

	public void setData(float radius) {
		this.radius = radius;
	}

	public int area() {
		return length * breath;
	}

	public float areaC() {
		return (float) Math.PI * radius * radius;
	}
}

public class MethodAndConstructorOverloading {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.setData(3,4);
		System.out.println("Area of rectangle:" + shape.area());
		shape.setData(5);
		System.out.println("Area of square:" + shape.area());
		shape.setData(20.5f);
		System.out.println("Area of circle:" + shape.areaC());
		
	}

}
