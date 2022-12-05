package innerClassPackage;

public class innerClassPackage {//rename package to concept
	
	private int a = 291;

	public void display() {
		
	}
	
	class Inner{//member inner class
		void access() {
			System.out.println(a);
		}
		
	}

	public static void main(String[] args) {
		
		innerClassPackage oc = new innerClassPackage();
		innerClassPackage.Inner in = oc.new Inner();
		in.access();
		
		
	}

}
