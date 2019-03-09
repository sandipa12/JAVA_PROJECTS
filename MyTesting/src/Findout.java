
public class Findout {
	public int row;
	public int column;
	public double maxValue;
	
	public Findout (int row, int column, double maxalue) {
		
	}
		
	public static Findout findlargest(double [][]array) {
		
	
	int row =0;
	int column =0; 
	double maxValue = array[row][column];
	for (int i = 0; i<array.length; i++) {
		for(int j =0; j <array[i].length; j++) {
			if(array[i][j]> maxValue) {
				row = i;
				column = j;
				maxValue = array[i][j];
				
			}
		}
	}
			
	return new Findout(row, column, maxValue);
}

}
