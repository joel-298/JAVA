// IMPORTING SYSTEM 


// package ___.___.packages.a ;                                 ----------------(1)

class MESSAGE { 
    // public static void main(String[] args){                  ---------------------(1)
    // 
    // }
    public static void message(){                              //----------------------------(2)
        System.out.println("This course is awesome") ; 
    }
}

// import static ___.___.packages.b.Message.message ;           ----------------(1)

public class GREETINGS{ 
    public static void main(String[] args){
        System.out.println("HELLO WORLD") ;
        // message() ;                                          ------------------------------------------------(1)
        MESSAGE.message() ; 
    }
}



// EXPLANATIONS : 
// (1) // if i imported this MESSAGE class then i would have been able to use this format
// (2) // If it was private we would have not being able to access