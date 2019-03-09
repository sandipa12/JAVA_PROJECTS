import java.util.Scanner;

public class PandeEx07_17 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Open input

		// Prompt the user to enter number of students
		System.out.println("Enter the number of students: ");
		final int NUM_OF_STUDENTS = input.nextInt();

		// Prompt the user to enter the students' names and scores
		String[] names = new String[NUM_OF_STUDENTS];
		double[] scores = new double[NUM_OF_STUDENTS];

		for (int i = 0; i < NUM_OF_STUDENTS; i++) {
			System.out.println("Enter the name of student: ");
			names[i] = input.next();
			System.out.println("Enter the score of student: ");
			scores[i] = input.nextDouble();
		} // Close for loop

		// Selection sort based on scores
		selectionSort(scores, names);

		// Print out results -- names in decreasing order of scores
		System.out.println("The names of students in decreasing order of scores is as follows: ");
		System.out.printf("%15s%10s%10s\n", "Name of student", " ", "Score");
		System.out.println("----------------------------------------------");

		for (int i = 0; i < names.length; i++) {
			System.out.printf("%-15s%15s%-10s\n", names[i], " ", scores[i]);
		} // Close for loop

		input.close(); // Close input

	} // Close main method

	public static void selectionSort(double[] list, String[] names) {
		for (int i = 0; i < list.length - 1; i++) {

			// Find the minimum in the list[i .. list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin < list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				} // Close if statement
			} // Close for loop

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				// Swap the corresponding names
				String temp = names[currentMinIndex];
				names[currentMinIndex] = names[i];
				names[i] = temp;
			} // Close if statement
		} // Close for loop
	} // Close selectionSort method

} // Close PandeEx07_17
