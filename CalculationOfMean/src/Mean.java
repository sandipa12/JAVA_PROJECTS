import java.util.Scanner;

public class Mean {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter day");
		int day = input.nextInt();

		switch (day) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("weekdays ");break;
		case 6:
		case 7:
			System.out.println("weekend");
			default :System.out.print("not a day");

		}

	}

}
