// INHERITANCE : 1 
// question INHERITANCE III ;
// calling a super function : 
class C extends B {
    @Override
    public void m1() {
        // Reuse the behavior from class B
        super.m1(); // Calls m1() from B, which prints "Code"
    }

    @Override
    public void m2() {
        // Print "Code" first
        System.out.println("Code");
        // Call the superclass's m2() method to print "Quotient"
        super.m2(); // Calls m2() from A, which prints "Quotient"
    }

    @Override
    public String toString() {
        // Return "new" concatenated with the result from B's toString() method
        return "new" + super.toString(); // Calls toString() from B
    }
}
