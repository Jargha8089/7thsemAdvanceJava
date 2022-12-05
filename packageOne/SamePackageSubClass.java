package packageOne;

public class SamePackageSubClass extends ProtectionLevel{
	
	public SamePackageSubClass() {
		System.out.println("Default number = " + num);
//		System.out.println("Private number = " + numpri);
		System.out.println("Protected number = " + numpro);
		System.out.println("Public number = " + numpub);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
