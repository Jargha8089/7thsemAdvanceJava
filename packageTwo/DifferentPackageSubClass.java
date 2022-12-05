package packageTwo;//same package

import packageOne.ProtectionLevel;//different package

public class DifferentPackageSubClass extends ProtectionLevel{
	
	public DifferentPackageSubClass() {
//		System.out.println("Default number = " + num);
//		System.out.println("Private number = " + numpri);
		System.out.println("Protected number = " + numpro);
		System.out.println("Public number = " + numpub);
	}

}
