//sandipa pande
//w0695366
//Cmps 161_04
//Programming Exercise 7.4
//11/19/2018
import java.util.Scanner;

public class PandeEx07_04  {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		
		//user input how many scores will be entered
		System.out.println("How many scores will be entered?");
		
		final int NUM_OF_SCORES = input.nextInt();
				
		//input the scores from the user
		System.out.println("Please enter the scores: ");
		
		double[] scores = new double[NUM_OF_SCORES];
	    double sum = 0;
		for (int i= 0; i < scores.length; i++) {
			
        	scores[i] = input.nextDouble();
		    sum += scores [i]; //sum the scores as they entered
		    } //end for loop
		
		input.close();
		
		//compute the average of the scores
				double average = sum / NUM_OF_SCORES;
				
		
		//determine how many are above or equal to average
		
		//determine how many scores are below the average
		int countAboveAverage=0;
		int countBelowAverage= 0;
		
						for (int i= 0; i < scores.length; i++) {
							if (scores[i] >= average) {
							   countAboveAverage ++;
							
							}
							else {
								countBelowAverage++;
							}
						}
							
		//report findings to user
		System.out.println("The average of the scores is: "+ average);
		System.out.println("the number of scores above or equal to average is :" + countAboveAverage);
		System.out.println("Number of scores below average is "+ countBelowAverage);
	}
}