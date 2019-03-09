public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	public static Location locateLargest(double[][] array) {
		int row = 0;
		int column = 0;
		double maxValue = array[row][column];
		for (int i=0;i<array.length;i++) {
			for (int j = 0; j<array[i].length;j++) {
				if (array[i][j] > maxValue) {
					row = i;
					column = j;
					maxValue = array[i][j];
				}
			}
		}
		
		return new Location(row, column, maxValue);
	}
}
