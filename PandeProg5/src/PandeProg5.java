//Sandipa Pande
//w0695366
//Cmps 161_04
//Program 5
//11/10/2018
import java.util.Scanner;

public class PandeProg5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of terms you wish to sum (must be an integer greater than 0)");

		int term = input.nextInt(); // number of terms to sum

		if (term > 0) { // valid input

			// print header table

			System.out.printf("%-10s%10s\n", "i", "computeM(i)");
			System.out.println(".......................................");

			// print table body
			for (int k = 1; k <= term; k++) {
				System.out.printf("%-10d%10.4f\n", k, computeM(k));
			}

		} else {

			System.out.println("Invalid input"); // invalid input
			System.exit(0);
		} // end if else

		input.close(); // close the scanner

	}// end main

	public static double computeM(int i) {// compute the sum of first i terms

		double sum = 0;

		for (int k = 1; k <= i; k++) {

			sum += k / (k + 1.0);

		}

		return sum;

	}// end computeM

}// PandeProg5
