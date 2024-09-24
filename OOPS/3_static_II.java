// STATIC  KEYWORD :  -->  can we have a static function insdie a NON static : TRUE -------(1)
//                    --> can we have a NON STATIC inside a STATIC : TRUE 

class Human {
    String name ; 
    static int population = 0 ;

    public static void setpopulation(int number){
        Human.population += number ; 
    }

    public Human(String name){
        this.name = name ; 
        setpopulation(1) ;                    // incrementing by one  -------(1)
    }
}


public class Main {
    public static void main(String[] args){
        Human Joel = new Human("JOEL") ; 
        System.out.println(Joel.population) ; 


        Main obj = new Main();              // -------------------------------(2)
        obj.display() ;                     // -------------------------------(2)
    }



    public void display(){                 // -------------------------------(2)
        System.out.println("NON STATIC INSIDE A STATIC") ; 
    }
}





// EXPLANATION : 
// (1) calling a static function from a non static 
// (2) calling a non static function through static 
// (3) U cannot use this keyword in a static function becuase this keyword is used for objects 
