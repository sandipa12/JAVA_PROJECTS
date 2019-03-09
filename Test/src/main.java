import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		double [][] matrix = new double [4][4];
		Scanner input = new Scanner(System.in);
	 System.out.print("Enter a 4*4 matrix row by row");
	 for (int row = 0; row < matrix.length; row++) {
		 for(int column= 0; column <matrix[row].length; column ++) {
			 matrix [row][column]= input.nextDouble();
		 }
	 }
	 System.out.println(" sum of elemsnts in the major diagonal is"+ sumMajorDiagonal(matrix));
	
	}
	public static double sumMajorDiagonal(double [][] m) {
		double sum = 0;
		for (int row = 0; row< m.length; row++) {
			sum += m[row][row];
		}
		return sum;
	}
}


