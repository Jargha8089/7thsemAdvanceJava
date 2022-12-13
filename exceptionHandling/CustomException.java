package exceptionHandling;

class OwnException extends Exception {
	public OwnException(String message) {
		super(message);// super le parent class ko constructor call garxa
	}
}

public class CustomException {

	public static void studentAge(int age) throws OwnException {
		if (age < 0) {
			throw new OwnException("Age less than zero exception");
		} else {
			System.out.println("Valid age");
		}
	}

	public static void main(String[] args) {
		try {
			studentAge(2);
		} catch (OwnException ex) {
			System.err.println(ex);
		}

	}

}
