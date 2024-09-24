// PROBLEM STATEMENT : 
// You need to design a Java program to demonstrate inheritance, method overriding, static methods, and constructors. Implement the following classes:

// 1) Box Class:
    // Fields: width, height, depth (for dimensions), and static boxCount (for tracking the number of boxes).
    // Constructors: Default, parameterized, and copy constructor.
    // Methods:
    // volume(): Calculate the box's volume.
    // displayDimensions(): Show the box's dimensions.
    // Static: getBoxCount() (returns total box objects) and showBoxInfo(Box box) (displays box info).

// 2) ColoredBox Class (inherits from Box):
    // Additional Field: color (string).
    // Constructors: Default and parameterized.
    // Methods:
    // Override displayDimensions() to show the color.
    // changeColor(String) and changeColor(int) to modify the box's color.

// 3) SealedBox Class (inherits from ColoredBox, final class):
    // Additional Field: isSealed (boolean).
    // Methods: Override displayDimensions() to show if the box is sealed.

// 4) BookCD Class:
    // In the main() method, create and manipulate instances of Box, ColoredBox, and SealedBox, and demonstrate all functionalities.