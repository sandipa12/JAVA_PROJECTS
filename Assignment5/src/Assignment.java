import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        // create a circle with center as x and y ,and radius 
        double x = input.nextDouble();
        double y = input.nextDouble();
         double radius = input.nextDouble();
        
        Circle2D circle1 = new Circle2D(x, y, radius);
        
        //create circle with center x and y , and radius as radius1
        double x1 = input.nextDouble();
       double  y1 = input.nextDouble();
         double radius1 = input.nextDouble();
         
        Circle2D circle2 = new Circle2D(x1, y1, radius1);

        System.out.println((Math.round(circle1.getArea() * 100.0) / 100.0) + " " + (Math.round(circle1.getPerimeter() * 100.0) / 100.0));
        
        System.out.println((Math.round(circle2.getArea() * 100.0) / 100.0) + " " + (Math.round(circle2.getPerimeter() * 100.0) / 100.0));
       
        if (circle1.contains(circle2) || circle2.contains(circle1)) {
            System.out.println("Contained");
        }
        if (circle1.overlaps(circle2)) {
            System.out.println("Overlapped");
        }

    }
}
   