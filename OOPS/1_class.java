//     TOPICS TO BE COVERED IN THIS CODE : 
// i)   Creation of Class 
// ii)  Creation of CONSTRUCTOR -> DEFAULT / PARAMETERIZED
// iii) BASICS OF INHERITANCE
// iv)  THIS keyword
// v)   SUPER keyword : THROUGH CONSTRUCTOR : THROUGH METHOD/FUNCTION
// vi)  CONSTRUCTOR OVERLOADING
// vii) METHOD OVER-RIDING / FUNCTION OVER-RIDING




class A {
    public int x = 30 ; 
    public A(){
        System.out.println("Parent Default Function Called") ; 
    }
    public A(int x){                                       // ---- 5)
        System.out.println(this.x) ; 
        this.x = x ; 
        System.out.println(x) ;
    }   
    public void display(){                                 // ---- 14) 
        System.out.println("TEST1"); 
    }
}
class B extends A {
    public int x = 20 ; 
    public B(){                                             // ---- 3)                        ----------------(*)
        super(60) ;                                         // ---- 4)
        System.out.println("B CHILD") ; //                  // ---- 6)
    }
    public B(int x) {
        System.out.println("PARAMETRIED CONSTRUCTOR OF B "+x) ;  
    }
    // @Override
    public void display(){                                  // ---- 11)
        System.out.println("TEST2") ;                       // ---- 12) 
        super.display() ;                                   // ---- 13)
    }
    public void check(){                                    // ---- 16) 
        System.out.println("CHECK B") ; 
    }
}
class C extends B {
    public C(){    
        System.out.println("C CHILD") ; 
    }
    public C(int x) {                                         // ---- 2)
        System.out.println(x) ;                               // ---- 7) 
    }
    // @Override  
    public void display(){                                    // ---- 9)
        System.out.println("TEST3") ;                                      
        super.display() ;                                     // ---- 10)                      // ----------------(*)
        check() ;                                             // ---- 15) 
    }
}



public class Main{
    public static void main(String[] args){
        C obj = new C(1) ;                                    // ---- 1)
        obj.display() ;                                       // ---- 8)                        

    }
}





// OUTPUT OF THIS CODE : 
// 30
// 60
// B CHILD
// 1
// TEST3
// TEST2
// TEST1
// CHECK B --------> this check function will not require super keyword (2)



// EXPLANATIONS : 1) METHOD OVER-RIDING : display function of C will run and B and A will not run but we are allowing from C through super keyword to run display function of B
//                 ---> and through B we are allowing to run display function of A  

// SUPER : CONSTRUCTOR : always use in the 1st line ! 
//         METHOD/FUNC : u can use it anywhere ! "super.parent_function_name()" ; or just write the "parent_function_name()" ;  


// 1)  Calling the parametrized constructor of C 
// 2)  C is child class and Inherite B and when we create a object of child class it automatically invokes the default constructor of parent class too 
// 3)  every constructor in B class will automatically call defaul constructor of class A untill and unless we write a super keyword 
//     To give direction to call which parametrized constructor of class A 
// 4)  From calling a default function we are now calling parameterized constructor 
// 5)  WILL PRINT
// 6)  WILL PRINT
// 7)  WILL PRINT
// 8)  OVER-RIDE : AS THE NAME SUGGESTS ITS OVER-RIDING THE "Display()" FUNCTION OF ITS PARENTS CLASS "B" AND "A" 
// 9)  WILL PRINT
// 10) WILL CALL THE DISPLAY FUNCTION OF PARENT CLASS THOURGH SUPER  
// 11) OVERRIDE AGAIN  : the parent class A 
// 12) WILL PRINT
// 13) CALL THE PARENT FUNCTION 
// 14) WLL PRINT
// 15) WILL CALL THE PARENT FUNCTION : if this function's name === its parent's function name then we would have required to use "SUPER" keyword ! 
// 16) WILL PRINT 
// (*) SUPER KEYWORD :  -> in case of CONSTRUCTOR :         Aways be written after initiliation of constructor 
//                      -> in case of METHOD/FUNCTION :     Can be written anywhere inside the function 
//                      -> in case of VARIABLE :            " " " " " " " " " " " " " " " " " " " " " " 