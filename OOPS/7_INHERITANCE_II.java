//                       'V' like structure of a class : 
// THIS CANNOT HAPPEN : because Java does not support multiple inheritance through classes . 
// REASON : This is due to the ambiguity that multiple inheritance can cause (like the "diamond problem"), 
//          where methods or properties inherited from multiple parent classes could conflict.

// SOLUTION : by using INTERFACES : we will discuss this later 
class A{
    public A() {
        System.out.println("A DEFAULT CONSTRUCTOR") ; 
    }
}
class B{
    public B() {
        System.out.println("B DEFAULT CONSTRUCTOR") ; 
    }
}
class C extends A , B{
    public C() {
        System.out.println("C DEFAULT CONSTRUCTOR") ; 
    }
}


public class HELLOWORLD{
    public static void main(String[] args){
        C obj = new C() ;
    }
}



// INTERFACE TOPIC IS COVER AFTER THE TOPIC ABSTRACT AND POLYMORPHISM  : in file 10_INTERFACE.java WHERE THIS PROBLEM STATEMENT WILL BE DISCUSSED