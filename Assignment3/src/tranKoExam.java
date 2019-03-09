import java.util.Scanner;
public class tranKoExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the row and col of array: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		double[][] array = new double[row][col];
		System.out.println("Please enter the numbers");
		for(int i =0;i< array.length;i++) {
			for(int j = 0; j < array[i].length;j++) {
				array[i][j] = sc.nextDouble();
			}
		}
		
		Location locate = Location.locateLargest(array);
		System.out.println("The row and column for the largest element in the array are" + locate.row + " , " + locate.column + " and the maximum value is " + locate.maxValue);
	}

}
