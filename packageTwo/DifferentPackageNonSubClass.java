package packageTwo;

import packageOne.ProtectionLevel;

public class DifferentPackageNonSubClass {
	
public DifferentPackageNonSubClass() {
		
		ProtectionLevel p = new ProtectionLevel(); // object
//		System.out.println("Default number = " + p.num);
//		System.out.println("Private number = " + p.numpri);
//		System.out.println("Protected number = " + p.numpro);
		System.out.println("Public number = " + p.numpub);
	}

}
