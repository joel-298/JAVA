// Interface GeometricObject with getPerimeter and getArea methods
interface GeometricObject {
    public double getPerimeter();
    public double getArea();
}
// Interface Resizable with the resize method
interface Resizable {
    public void resize(int percent);
}





class Circle implements GeometricObject
{
	public double radius ;
    public Circle(double radius){
    	this.radius = radius ; 
    }
    public double getPerimeter(){
    	return Math.round(2*Math.PI*radius*100.0)/100.0 ;           // THIS FLOAT IS DISCUSSED IN 1_FLOAT_DECIMAL_DIGITS.java in BASICS : 
    }
    public double getArea(){
    	return Math.round(Math.PI*radius*radius*100.0)/100.0 ;           // THIS FLOAT IS DISCUSSED IN 1_FLOAT_DECIMAL_DIGITS.java in BASICS : 
    }
    public String toString(){
    	return "Circle[radius="+String.format("%.1f",radius)+"]" ;
    }
}

class ResizableCircle extends Circle implements Resizable
{
	public ResizableCircle(double radius){
    	super(radius) ;
    }
    public void resize(int percent){
    	radius = radius * percent / 100.0;         // THIS FLOAT IS DISCUSSED IN 1_FLOAT_DECIMAL_DIGITS.java in BASICS : 
    }
}


// Explanation:
// Circle Class: Implements the GeometricObject interface, calculating the circle's perimeter and area. It has a toString method that returns the string in the required format.
// ResizableCircle Class: Extends Circle and implements the Resizable interface. It overrides the resize method to adjust the radius by the given percentage.
// Main Class: Demonstrates creating a circle, printing its properties, resizing a ResizableCircle, and printing the updated perimeter and area.










// C O R R E C T   C O D E     S E N D    B Y       K A R T I K   I S    D O W N    B  E  L  O  W : 