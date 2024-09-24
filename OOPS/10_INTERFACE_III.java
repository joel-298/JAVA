// QUESTION 2 : INTERFACE 


interface GeometricObject {
    public double getPerimeter();

    public double getArea();
}

interface Resizable {
    public void resize(int percent);
}

class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        radius *= (percent / 100.0);
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}


public class PracticeProblem2 {
    public static void main(String args[]) {
        Circle circle = new Circle(10);
        System.out.println("Initial Circle:");
        System.out.println("Radius: " + circle.radius);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(20);
        System.out.println("\nInitial ResizableCircle:");
        System.out.println("Radius: " + resizableCircle.radius);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());

        resizableCircle.resize(50);
        System.out.println("\nAfter resizing ResizableCircle by 50%:");
        System.out.println("Radius: " + resizableCircle.radius);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());

        resizableCircle.resize(200);
        System.out.println("\nAfter resizing ResizableCircle by 200%:");
        System.out.println("Radius: " + resizableCircle.radius);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
    }
}