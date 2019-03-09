import java.util.Scanner;

public class Cookfood {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter total number of seconds: ");

		int totalSeconds = input.nextInt();

		int minutes = totalSeconds / 60;

		int remainingSeconds = totalSeconds % 60;

		System.out.println("Enter " + minutes + ":" + remainingSeconds + " in the microwave oven.");

	}

}
