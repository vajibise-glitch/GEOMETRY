package GEOMETRY;

public class RegularPolygon {
    private int n;              // Number of sides
    private double side;        // Length of each side
    private double x;           // X-coordinate of the center
    private double y;           // Y-coordinate of the center

    // No-arg constructor with default values
    public RegularPolygon() {
        this(3, 1.0, 0.0, 0.0);
    }

    // Constructor with specified number of sides and side length
    public RegularPolygon(int n, double side) {
        this(n, side, 0.0, 0.0);
    }

    // Constructor with specified number of sides, side length, and center coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessors and mutators
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // Method to calculate the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create objects using different constructors
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display perimeter and area for each polygon
        System.out.printf("Polygon 1 - Perimeter: %.2f, Area: %.2f%n", polygon1.getPerimeter(), polygon1.getArea());
        System.out.printf("Polygon 2 - Perimeter: %.2f, Area: %.2f%n", polygon2.getPerimeter(), polygon2.getArea());
        System.out.printf("Polygon 3 - Perimeter: %.2f, Area: %.2f%n", polygon3.getPerimeter(), polygon3.getArea());
    }
}