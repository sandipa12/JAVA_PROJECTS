import java.util.Scanner;
 
public class ProgramingEx8_1 {
 
 public static void main(String[] args) {
 
  double [][] matrix = new double[3][4];
 
  java.util.Scanner input = new Scanner(System.in);
  System.out.println("Enter a 3-by-4 matrix row by row: ");
  for (int row = 0; row < matrix.length; row++) {
   for (int column = 0; column < matrix[row].length; column++) {
    matrix[row][column] = input.nextDouble();
   }
  }
 
  for (int j = 0; j < matrix[0].length; j++) {
   System.out.println("max element of row" + j
     + " is " + sumColumn(matrix,j));
  }
 
 }
 
 public static double sumColumn(double[][] m, int columnIndex) {
	 int row = 0;
	 int column =0;
	 
	double x = m[row][column];
	double max = x;
	for (int i =0;i<m.length;i++) {
	for (int j=0; j <m[i].length;j ++) {
		if(m[i][j] > x) {
			max = m[i][j];
		}
		
		
		 }
	 }
 return max;
 }
 
}