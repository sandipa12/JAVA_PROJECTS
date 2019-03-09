// Sandipa Pande
// w0695366
// CMPS_161_04
// Program_4
// 10/21/2018


import java.util.Scanner;

public class PandeProg4 {

	public static void main(String[] args) {

		// declared boolean variable and set it to true.
		boolean weArePlaying = true;

		//created scanner object
		Scanner input = new Scanner(System.in);

		// loop until the variable is false.
		while (weArePlaying) {

			System.out.println("1" + " " + " 2 " + " " + " 3 \n" + " " + " " + "ABC" + " " + "DEF \n" + "4 " + " "
					+ " 5 " + " " + " 6 \n" + "GHI " + " " + "JKL" + " " + "MNO \n " + "7 " + " " + " 8 " + " "
					+ " 9 \n" + "PQRS" + " " + "TUV" + " " + "WXYZ");

			System.out.println("Please input the letter you want to find out the value of : ");

			// Get user input.
			String letter = input.nextLine();

			// Capitalize the input letter to ignore case.
			switch (letter.toUpperCase()) {

			// Case ABC
			case ("A"):
			case ("B"):
			case ("C"):

				System.out.println("The code for " + letter + " is " + " 2");
				break;

			// Case DEF
			case ("D"):
			case ("E"):
			case ("F"):

				System.out.println("The code for " + letter + " is " + " 3 ");
				break;

			// Case GHI
			case ("G"):
			case ("H"):
			case ("I"):

				System.out.println("The code for " + letter + " is " + " 4 ");
				break;

			// Case JKL
			case ("J"):
			case ("K"):
			case ("L"):
				
				System.out.println("The code for " + letter + " is " + " 5 ");
				break;

			// Case MNO
			case ("M"):
			case ("N"):
			case ("O"):
				
				System.out.println("The code for " + letter + " is " + " 6 ");
				break;

			// Case PQRS
			case ("P"):
			case ("Q"):
			case ("R"):
			case ("S"):
				
				System.out.println("The code for " + letter + " is " + " 7 ");
				break;

			// Case TUV
			case ("T"):
			case ("U"):
			case ("V"):
				
				System.out.println("The code for " + letter + " is " + " 8 ");
				break;

			// Case WXYZ
			case ("W"):
			case ("X"):
			case ("Y"):
			case ("Z"):
				
				System.out.println("The code for " + letter + " is " + " 9 ");
				break;
			
			// Case to exit the program.
			case ("1"):
				// Exit program with input 1.
				System.out.println("Exiting the program");
				weArePlaying = false;
				break;
			
			// Default Case.
			default:
				System.out.println("Invalid input try again");
				break;
			}
			
			System.out.println("***********************************************");

		}
		
		// Close the input.
		input.close();
	}
}
