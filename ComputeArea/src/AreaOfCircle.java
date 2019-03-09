import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		final double PI = Math.PI;

		//ceate a scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();

		//compute area
		double area = radius * radius * PI;

		//display result
		System.out.println("The area of a circle with radius " + radius + " is " + area);

	}

}
