
//Sandipa Pande
//W0695366
//CMPS_161_04
//Program_2
//09/20/2018

import java.util.Scanner;
import java.lang.Math;

public class PandeProg2 {

	public static void main(String[] args) {

		// creating a scanner
		Scanner input = new Scanner(System.in);

		// User inputs the investment amount
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		// User inputs annual interest rate
		System.out.print("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		// converting annual interest rate into monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// User inputs number of years
		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();

		// calculation of future investment value
		double futureInvestmentValue = investmentAmount * (Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

		// displaying result
		System.out.print("Accumulated Value is $" + (int) (futureInvestmentValue * 100) / 100.0);

	}

}
