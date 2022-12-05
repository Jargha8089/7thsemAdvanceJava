// inheritance

package inheritancePackage;

class room {
	int length, breadth;

	public room(int length, int breadth) {// constructor
		this.length = length;
		this.breadth = breadth;
	}

	int area() {
		return length * breadth;
	}
}

class bedroom extends room {
	int height;

	public bedroom(int length, int breadth, int height) {
		super(length, breadth);// calls the base constructor
		this.height = height;
	}

	int volume() {
		return length * breadth * height;
	}
}

public class Room {

	public static void main(String[] args) {
		bedroom room = new bedroom(3, 5, 7);
		System.out.println("Area =" + room.area());
		System.out.println("Volume =" + room.volume());
	}

}