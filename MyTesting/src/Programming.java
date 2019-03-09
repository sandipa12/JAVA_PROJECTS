import java.util.Scanner;
public class Programming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the rows and columns ");
		int row = input.nextInt();
		int column = input.nextInt();
		double [][] array = new double [row][column];
		System.out.println("ente rthe numbers");
		for (int i =0; i<array.length;i ++) {
			for (int j = 0; j <array[i].length;j++) {
				array [i][j]= input.nextDouble();
			}
		}
		Findout find = Findout.findlargest(array);
		System.out.println(" the  row and column for the largest element are"+ find.row + "and"+ find.column +"and the largest element is "+ find.maxValue);

	}

}
