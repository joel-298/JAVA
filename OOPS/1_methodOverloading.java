// When functions in the same class has same name but different parameters or parameter's data types 

// EXAMPLE 1 : CHANGING THE NUMBER OF PARAMETERS
class MathOperations {
    public int add(int a) {}
    public int add(int a, int b) {}
}

// EXAMPLE 2 : CHANGIND THE DATATYPE
class Display {
    public void show(int a) {}
    public void show(double a) {}
}

// EXAMPLE 3 : CHANGING THE ORDER
class Print {
    public void display(String name, int age) {}
    public void display(int age, String name) {}
}