
public class TotalArea {

	public static void main(String[] args) {
		
		// Declare array of circles
		
		CircleWPDF [] circleArray;
		
		 // create array using method 
		
		circleArray = createCircleArray();
		
		//print result
		printArray(circleArray);
	
	}
	
	
	// method to create array of circle and initialize the values 
	
	public static CircleWPDF[] createCircleArray (){
		
		CircleWPDF[] circleArray = new CircleWPDF [5];
		
		for (int i = 0; i < circleArray.length; i++) {
			
			circleArray[i] = new CircleWPDF(Math.random()*100);
			
		}
		
		return circleArray;
		
	}
	
	// method to print out the result
	
	public static void printArray(CircleWPDF[] circleArray) {
		
		for (int i = 0; i < circleArray.length; i++) {
		
		System.out.println("\n" + circleArray[i].getRadius() + "      " + circleArray[i].getArea());
		
		}
	     System.out.println("-----------------------------------------------------");
		System.out.println ("Total sum of areas of all circles  is "+ sum(circleArray));
	}
	
	// method to sum up the areas of all circles
	
	public static double sum(CircleWPDF[] circleArray) {
		
		double sum = 0;
		
		for (int i = 0; i < circleArray.length; i++) {
			
			sum += circleArray[i].getArea();
		}
		
		return sum;
	}

}
