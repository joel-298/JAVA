//     TOPICS TO BE COVERED IN THIS CODE : 
// i)   Creation of Class 
// ii)  Creation of CONSTRUCTOR -> DEFAULT / PARAMETERIZED
// iii) BASICS OF INHERITANCE
// iv)  THIS keyword
// v)   SUPER keyword
// vi)  CONSTRUCTOR OVERLOADING
// vii) METHOD OVER-RIDING / FUNCTION OVER-RIDING




class A {
    public int x = 30 ; 
    public A(){
        System.out.println("Parent Default Function Called") ; 
    }
    public A(int x){
        System.out.println(this.x) ; 
        this.x = x ; 
        System.out.println(x) ;
    }
    public void display(){
        System.out.println("TEST1"); 
    }
}
class B extends A {
    public int x = 20 ; 
    public B(){
        super(60) ;  // from calling a default function we are now calling parameterized function 
        System.out.println("B CHILD") ;
    }
    public void display(){
        System.out.println("TEST2") ; 
        super.display() ; 
    }
    public void check(){
        System.out.println("CKECK") ; 
    }
}
class C extends B {
    public C(){    
        System.out.println("C CHILD") ; 
    }
    public void display(){                         // ----------------(1)
        System.out.println("TEST3") ; 
        super.display() ;  
        check() ; // --------------------------(2)
    }
}



public class HELLOWORLD{
    public static void main(String[] args){
        C obj = new C() ; 
        obj.display() ; 

    }
}





// OUTPUT OF THIS CODE : 
// 30
// 60
// B CHILD
// C CHILD
// TEST3
// TEST2
// TEST1
// CKECK --------> this check function will not require super keyword (2)



// EXPLANATIONS : 1) METHOD OVER-RIDING : display function of C will run and B and A will not run but we are allowing from C through super keyword to run display function of B
//                 ---> and through B we are allowing to run display function of A  