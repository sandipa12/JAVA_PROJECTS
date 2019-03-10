
public class TestSimpleCircle {

	public static void main(String[] args) {
		SimpleCircle Circle1 = new SimpleCircle(1);
		
		System.out.println(Circle1.getRadius());
		 int n = 5;
		 PrintArea(Circle1, n);
		

	}
	public static void PrintArea(SimpleCircle c, int times) {
		System.out.println( c.getRadius() + "and" + c.getArea());
		c.setRadius(c.getRadius()+1);
		while(times > 1) {
			System.out.println( c.getRadius() + "and" + c.getArea());
			c.setRadius(c.getRadius()+1);
			times --;
			
		}
	}

}
class SimpleCircle{
	
	private double radius;
	
	SimpleCircle(){
		
		radius = 1;
		
	}
	SimpleCircle (double newRadius){
		radius = newRadius;
	}
	 
	public double getRadius() {
		return radius;
	}
	double getArea() {
		return radius*radius* Math.PI;
	}
	public void setRadius(double newRadius) {
		this.radius = newRadius	;
			}
	
	
}
