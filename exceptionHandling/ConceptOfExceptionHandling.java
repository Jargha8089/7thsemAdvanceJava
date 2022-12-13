package exceptionHandling;
//checked exception-checked at compile time

// unchecked exception-checked at run time rather than compile time

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConceptOfExceptionHandling {
	public static int division(int numerator, int denominator) {
		return numerator / denominator;
	}

//try-catch

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean contLoop = true;

		do {
			try {

				System.out.println("Enter Numerator");
				int n = input.nextInt();

				System.out.println("Enter Denominator");
				int d = input.nextInt();

				System.out.println("The division is:" + division(n, d));
				contLoop = false;
			}

			catch (InputMismatchException ex) {// string
				System.err.println("Mismatch Exception is:" + ex);
				input.nextLine();
				System.out.println("Enter proper data");
			}

			catch (ArithmeticException ex) {// denominator zero
				System.err.println("Arthmetic Exception is:" + ex);
				System.out.println("Enter non-zero denominator");

			}
		} while (contLoop);

	}

}
