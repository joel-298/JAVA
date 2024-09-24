// INTERFACE : it is not a class and by default every function/method in a interface is abstract(and public too) // ----------------------(0)
//            (4)  ALL THE VARIABLE INSDE THE INTERFACE ARE FINAL AND STATIC 



// CASE 1 : 
interface A { 
    int age  = 10 ;
    String name = "JOEL" ; 
    abstract void show() ;                // ----------------------(0) therefore we do not have to write abstract here
    abstract void config() ; 
}

// class B extends A {
class B implements A {
    public void show(){
        System.out.println("INSIDE OF SHOW") ; 
    }
    public void config(){
        System.out.println("INSIDE OF CONFIG") ; 
    }
}

public class Main{
    public static void main(String[] args){
        // A obj = new A() ;  ---------------------(1)  
        A obj = new B() ;     // --------(2)
        B obj2 = new B() ;    // --------(3)

        obj.show() ; 
        obj.config() ;

        // printing vairble of INTERFACE
        System.out.println(A.age) ; 
    }
}

// EXPLANATION : 
// (1) This will give error 
// between 2 and 3 , 3 is the better approach and both of them 2 and 3 will work 








// // CASE 2 : that we discussed in 7_INHERITANCE_II : 
// interface FATHER{ 
//     void display() ;
// }
// interface MOTHER{
//     void display() ;
// }
// class CHILD implements FATHER, MOTHER{
//     public void display(){
//         System.out.println("THIS IS CHILD") ; 
//     }
// }
// public class HELLO{
//     public static void main(String[] args){
//         CHILD obj = new CHILD() ; 
//         obj.display() ; 
//     }
// }


// // OUTPUT : 
// // THIS IS CHILD

// // === Code Execution Successful ===




// // Single Implementation in CHILD: The CHILD class provides the implementation of the display() method. 
// // Since both FATHER and MOTHER have the same method signature, there is only one implementation in CHILD that fulfills both interfaces.