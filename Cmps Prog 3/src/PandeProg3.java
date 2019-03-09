//Sandipa Pande
//w0695366
//Cmps_161_04
//Program 3
//9/30/2018
import java.util.Scanner;
public class PandeProg3 {

	public static void main(String[] args) {
		
		//creating import scanner
		Scanner input = new Scanner(System.in);
		
		//Prompting user to enter input
		System.out.println("Enter a numerator: ");
		int numerator = input.nextInt();
		
		System.out.println("Enter a denominator: ");
		int denominator = input.nextInt();
		
		
		if(numerator<denominator) {
			System.out.println(numerator/denominator + "is a proper fraction");
			
				
			}
		}
		
		
		
		
	}

}
