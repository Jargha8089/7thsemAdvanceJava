package packageOne;

public class ProtectionLevel {
	
	int num = 20;//default modifier
	private int numpri = 30;//private modifier
	protected int numpro = 40;//protected modifier
	public int numpub = 50;//public modifier
	
	public ProtectionLevel() {
		
		System.out.println("Default number = " + num);
		System.out.println("Private number = " + numpri);
		System.out.println("Protected number = " + numpro);
		System.out.println("Public number = " + numpub);



	}

	

}
