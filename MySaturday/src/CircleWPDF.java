
public class CircleWPDF {
	
	private double  radius;
	
	CircleWPDF() {
		
		radius = 1.0;
		
	}
	
	CircleWPDF(double newRadius){
		
		radius = newRadius;
	}
	
	public double getRadius() {
		
		return radius;
		
	}
	public void setRadius( double newRadius) {
		
		radius = newRadius;
	}
	
	public double getArea() {
		
		return radius*radius*Math.PI;
	}
 
}
