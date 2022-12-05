package innerClassPackage;

class Outer{
	int a = 45;
	
	void display() {
		class inner{
			void print() {
				System.out.println("Value=" + a);
			}
		}
		inner in = new inner();
		in.print();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.display();
		
	}

}
