package exceptionHandling;

import java.util.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyConcept {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Input number of iteration");
			int it = input.nextInt();
			for (int i = 0; i < it; i++) {
				if (i == 5) {
					//break; //finally execute
					//continue;//finally execute
					//return;//finally execute
					//System.exit(0);//finally does not execute
					throw new Exception();
				}
				System.out.println(i);
			}
		} //catch (InputMismatchException ex) {
			//System.err.println(ex);
		//} 
		catch (RuntimeException ex) {
			System.err.println(ex);
		} finally {
			System.out.println("I always Execute");
			input.close();
		}

	}

}
