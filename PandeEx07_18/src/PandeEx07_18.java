import java.util.Scanner;

public class PandeEx07_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Open scanner input

		// User inputs how many numbers to be sorted

		System.out.println("How many integers do you want to input?");

		final int NUM_OF_INTEGERS = input.nextInt();

		// User inputs the numbers into an array

		int[] integerNumbers = new int[NUM_OF_INTEGERS];

		for (int i = 0; i < NUM_OF_INTEGERS; i++) {

			System.out.println("Input integers: ");

			integerNumbers[i] = input.nextInt();

		} // Close for loop

		// Bubble sort the array

		bubbleSort(integerNumbers);

		// Print out the sorted list of numbers

		System.out.println("The increasing order of integers is as follows: ");

		for (int i = 0; i < integerNumbers.length; i++) {

			System.out.print(integerNumbers[i] + " ");

		} // Close for loop

		input.close(); // Close input

	} // End main method

	public static void bubbleSort(int[] list) {

		boolean changed = true;

		do {

			changed = false;

			for (int j = 0; j < list.length - 1; j++) {

				if (list[j] > list[j + 1]) {

					// Swap list[j and list [j+1]

					int temp = list[j];

					list[j] = list[j + 1];

					list[j + 1] = temp;

					changed = true;

				} // End if statement

			} // End for

		} while (changed == true); // End do-while loop

	} // Close bubbleSort method

} // Close PandeEx07_18
