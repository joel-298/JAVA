class A{
    static{                                                     // 8 print this one time , 10 will not print after 9 
        System.out.println("i am a static block of A");
    }
}


public class Main { 
    static int a = 4 ;                // 1   
    static int b ;                    // 2

    static {                                      // 3 
        System.out.println("IM A STATIC BLOCK") ;  
        b = a * 5 ;                                 // 4 
    }
    public static void main(String[] args){        
        Main obj1 = new Main() ;                         // 5            
        System.out.println(Main.a + " " + Main.b) ;      // 6 
        A obj = new A();                                // 7 
        A obj2 = new A();                               // 9 
        
    }
}