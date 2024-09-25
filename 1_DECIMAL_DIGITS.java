// RETURN A NUMBER BASED ON DECIMAL DIGITS : 



class Circle {
    // Private field to hold the radius of the circle
    private double radius;

    // Constructor that initializes the circle with a given radius
    public Circle(double r) {
        this.radius = r;
    }

    // Method to calculate and return the area of the circle
    public double area() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0; // Rounded to 2 decimal places
    }

    // Method to calculate and return the circumference of the circle
    public double circumference() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0; // Rounded to 2 decimal places
    }

    // Method to return the radius of the circle
    public double getRadius() {
        return Math.round(radius * 10.0) / 10.0; // Rounded to 1 decimal place
    }

    // Method to return a string representation of the circle
    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}