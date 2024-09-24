// STATIC -> FLOW CONTROL :


public class Hello { 
    static int a = 4 ;                  // -----------(1)
    static int b ; // i.e b = 0         // -----------(2)

    static { 
        System.out.println("IM A STATIC BLOCK") ;  // -----------(3)
        b = a * 5 ; 
    }
    public static void main(String[] args){          // -----------(4)
        Hello obj1 = new Hello() ;                   // -----------(5)
        System.out.println(Hello.a + " " + Hello.b) ;// ------------(6)
        
    
    }
}