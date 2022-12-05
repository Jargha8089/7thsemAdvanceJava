import java.util.Scanner;

public class MultiplecationTable {
	static int rows;// final value, accessed in a class
	static int cols;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter rows value");
		rows = input.nextInt();

		System.out.println("Enter cols value");
		cols = input.nextInt();

		System.out.println("The multiplication table is :");

		//int product[][] = new int[rows][cols];
		for (int i = 1; i < rows; i++) {
			System.out.println("The multiplication table is :" + i);

			for (int j = 1; j <= cols; j++) {
				//product[i][j] = i * j;
				int k = i * j;
				System.out.print(i + " * " + j + " = " + k + "\n");
				//System.out.print(i + " * " + j + " = " + product[i][j] + "\n");
			}

			System.out.println("---------------");
		}

	}

}
