package innerClassPackage;



abstract class Anonymous{
	abstract void display();//signature
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		Anonymous ac = new Anonymous() {
			@Override
			void display() {
				System.out.println("I am anonymous inner class");
			}
		};
		ac.display();
		
	}

}
