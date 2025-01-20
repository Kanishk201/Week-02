public class Circle {
    // Attribute
    double radius;

    // Default constructor (calls parameterized constructor with default value)
    public Circle() {
        this(1.0); // Default radius value is 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    public void displayCircleDetails() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + calculateArea());
    }

    public static void main(String[] args) {
        // Using default constructor (radius set to 1.0)
        Circle defaultCircle = new Circle();
        defaultCircle.displayCircleDetails();

        System.out.println();

        // Using parameterized constructor (radius set to 5.0)
        Circle customCircle = new Circle(5.0);
        customCircle.displayCircleDetails();
    }
}
