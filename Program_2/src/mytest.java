import java.util.Scanner;

public class Circle2D {

    public static void main(String[] args) {
        double x, y, radius;
        Scanner reader = new Scanner(System.in);
        x = reader.nextDouble();
        y = reader.nextDouble();
        radius = reader.nextDouble();
        Circle2D c1 = new Circle2D(x, y, radius);
        x = reader.nextDouble();
        y = reader.nextDouble();
        radius = reader.nextDouble();
        Circle2D c2 = new Circle2D(x, y, radius);

        System.out.println((Math.round(c1.getArea() * 100.0) / 100.0) + " " + (Math.round(c1.getPerimeter() * 100.0) / 100.0));
        System.out.println((Math.round(c2.getArea() * 100.0) / 100.0) + " " + (Math.round(c2.getPerimeter() * 100.0) / 100.0));
        if (c1.contains(c2) || c2.contains(c1)) {
            System.out.println("Contained");
        }
        if (c1.overlaps(c2)) {
            System.out.println("Overlapped");
        }

    }

    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;

    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;

    }

    public double getRadius() {
        return this.radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return distance <= getRadius();
    }

    public boolean contains(Circle2D c2) {
        double distance = Math.sqrt(Math.pow((this.x - c2.getX()), 2) + Math.pow((this.y - c2.getY()), 2));
        return (distance + c2.radius) <= getRadius();
    }

    public boolean overlaps(Circle2D c2) {
        double distance = Math.sqrt(Math.pow((this.x - c2.getX()), 2) + Math.pow((this.y - c2.getY()), 2));
        return distance <= getRadius() + c2.getRadius();
    }
}
