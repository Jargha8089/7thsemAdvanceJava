
public class ObjectOrientedConcept {
	// declaring variables
	int a;
	float b;
	double c;

	// defining method

	void method1() {

	}

	int method2() {
		return 0;
	}

	void add(int a, int b) {

	}

	int mul(int b, int c) {
		return b * c;
	}

	public static void main(String[] args) {
		// Object creation
		ObjectOrientedConcept ooc = new ObjectOrientedConcept();
		// ooc is an instance or object
		// accessing variables or methods
		ooc.a = 24;
		ooc.b = 321.545f;
		ooc.c = 13231.444333d;
		System.out.println(ooc.mul(3, 4));

	}

}
