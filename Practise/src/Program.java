import java.util.Scanner;

public class Program {

	 public static void main(String[] args) {
		 java.util.Scanner input = new Scanner(System.in);
		 int row = input.nextInt();
		 int column = input.nextInt();
		  double [][] matrix = new double[row][column];
		  System.out.println("Enter  matrix row by row: ");
		  for (int i = 0; i < matrix.length; i++) {
		   for (int j = 0; j < matrix[row].length; j++) {
		    matrix[i][j] = input.nextDouble();
		   }
		  }
		 System.out.println(matrix.length);
		 
		  for (int i = 0; i < matrix[0].length; i++) {
		   System.out.println("min element of column" + i
		     + " is " + columnMin(matrix,i));
		  }
		 
		 }
		 
		 public static  double columnMin(double[][] m, int columnIndex) {
			 double min = m[0][columnIndex];
			 for(int i=0;i<m.length;i++) {
				 if(min>m[i][columnIndex]) {
					 min = m[i][columnIndex];
				 }
			 }
			 return min;
		 }
		 
		}
