
public class TestSimpleCircle {

	public static void main(String[] args) {
		SimpleCircle Circle1 = new SimpleCircle();
		SimpleCircle Circle2 = new SimpleCircle(25.0);
		System.out.println(Circle2.getArea());
		Circle2.radius = 100;
		System.out.println(Circle1.getArea());
		System.out.println(Circle2.getArea());
		Circle1.setRadius(20.0);
		System.out.println(new SimpleCircle(125.0).getArea());
	
		 
		

	}

}
class SimpleCircle{
	
	double radius;
	
	SimpleCircle(){
		
		radius = 1;
		
	}
	SimpleCircle (double newRadius){
		radius = newRadius;
	}
	 
	double getArea() {
		return radius*radius* Math.PI;
	}
	void setRadius(double newRadius) {
		this.radius = newRadius	;
			}
	
	
}
