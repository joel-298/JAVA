// QUESTION 1 : INTERFACE 


interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y -= ySpeed;
    }

    public void moveDown() {
        y += ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "[X=" + x + ", Y=" + y + "]";
    }
}


class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "[X=" + center.x + ", Y=" + center.y + ", radius=" + radius + "]"; // Return the current position and radius as a string
    }
}

public class PracticeProblem1 {
    public static void main(String args[]) {
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println("Initial Position of Point: " + point);

        point.moveUp();
        System.out.println("After moving up: " + point.toString());

        point.moveRight();
        System.out.println("After moving right: " + point.toString());

        point.moveDown();
        System.out.println("After moving down: " + point.toString());

        point.moveLeft();
        System.out.println("After moving left: " + point.toString());

        MovableCircle circle = new MovableCircle(10, 10, 3, 3, 15);
        System.out.println("\nInitial Position of Circle: " + circle);

        circle.moveUp();
        System.out.println("After moving up: " + circle.toString());

        circle.moveRight();
        System.out.println("After moving right: " + circle.toString());

        circle.moveDown();
        System.out.println("After moving down: " + circle.toString());

        circle.moveLeft();
        System.out.println("After moving left: " + circle.toString());
    }
}