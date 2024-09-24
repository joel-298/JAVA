// FINAL KEYWORD :  (just like const int CPP)
// can be used with :->    Variable , Method/Function , Class 




// CASE 1,2
final class CALC{
    public void show() { 
        System.out.println("IN CALC SHOW") ;   
    }
    public void add(int a, int b){
        System.out.println(a+b) ; 
    }
}
// class ADV_CALC extends CALC{ // -------------------------------(2)
// }

public class HELLO {
    public static void main(String[] args){
        
        final int num = 18 ; 
        // num = 9 ; ------------------------------------------------(1)  
        System.out.println(num) ; 

    
        CALC obj =  new CALC() ; 
        obj.show() ; 
        obj.add(a,b); 

    }
}



// EXPLANATION : 
// (1) ----- will give error , case of Vairble 
// (2) ----- will give error , case of CLASS : no one can extend it
//           no one should be able to INHERIT my class therefore not anyone can inherit my class etc etc
//           BECAUSE someone else can create their own class and use my FEATURES



// (3) ------- in case of METHOD/FUNCTION we have to stop METHOD OVERRIDING (if the class is not FINAL)
// CASE 3: 
class ORIGINAL { 
    public final void display(){
        System.out.println("THIS IS ORIGINAL") ; 
    }
}
class DUBLICATE extends ORIGINAL{
    public void display(){
        System.out.println("This is original") ; 
    }
}
public class HELLO{
    public static void main(String[] args){
        DUBLICATE obj = new DUBLICATE() ; 
        obj.display() ; 
    }
}
// THEREFORE THIS WILL GIVE ERROR because we have put the final keyword in ORIGINAL -> display which is preventing from function overrding
// ERROR : 
//     public void display(){
//                 ^
//   overridden method is final
// 1 error

// === Code Exited With Errors ===