public class Circle2D{

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
    // get area of circle
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
    // get perimeter pf circle
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
    
    // return true if  circle1 is in circle2
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return distance <= getRadius();
    }
    // return true if circle1 is contained in circle2
    public boolean contains(Circle2D circle2) {
        double distance = Math.sqrt(Math.pow((this.x - circle2.getX()), 2) + Math.pow((this.y - circle2.getY()), 2));
        return (distance + circle2.radius) <= getRadius();
    }
    // return true if they overlap
    public boolean overlaps(Circle2D circle2) {
        double distance = Math.sqrt(Math.pow((this.x - circle2.getX()), 2) + Math.pow((this.y - circle2.getY()), 2));
        return distance <= getRadius() + circle2.getRadius();
    }
}
