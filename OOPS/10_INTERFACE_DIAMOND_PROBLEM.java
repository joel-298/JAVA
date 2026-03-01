interface A {
    default void sayHello() {
        System.out.println("Hello from A");
    }
}

interface B extends A {
    default void sayHello() {
        System.out.println("Hello from B");
    }
}

interface C extends A {
    default void sayHello() {
        System.out.println("Hello from C");
    }
}

// Class D implements both B and C
class D implements B, C {
    // Must override sayHello to resolve the conflict
    public void sayHello() {
        // We can choose which interface's
        B.super.sayHello()  ; // or C.super.sayHello() ; 
    }
}