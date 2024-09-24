// TOPICS TO COVERED IN THIS : 
// STATIC keyword : --> Static variable 
//                  --> Static function 




class Human { 
    int age ; 
    String name ; 
    int salary ; 
    boolean married ; 
    static long population = 0;                               // common to everyone 

    public Human(int age, String name, int salary , boolean married){
        this.age = age ; 
        this.name = name ; 
        this.salary = salary ; 
        this.married = married ; 
        Human.population += 1 ;                                // also work with this.population, but better is to write class name
    }
    public void display() {
        System.out.println("NAME: "+name+", AGE : "+age+", SALARY : "+salary+", MARRIED : "+married) ; 
    }
}

public class Main{
    public static void main(String[] args){                        // ----------------------------------------------------(1)
        Human Joel = new Human(20,"JOEL",200000,false) ; 
        System.out.println(Joel.population) ; 
        Human Kashish = new Human(20,"KASHISH",200000,false); 
        Joel.display() ; 
        Kashish.display() ;                  
        System.out.println(Joel.population) ;                       // 2 ----> Both have same output because static variable is common for all
        System.out.println(Kashish.population) ;                    // 2 ----> Both have same output because static variable is common for all




        // Hello() ;                                                // -------------(2) ERROR
        WORLD() ;                                                   // -------------(3)
    }
    // public void Hello(){
    //     System.out.println("HELLO"); 
    // }
    public static void WORLD(){
        System.out.println("WORLD") ; 
    }

}




// i)  STATIC CAN BE ACCESS EVEN WITHOUT CREATING THE OBJECT : i.e STATIC VARIBLES ARE INDEPENDENT FROM OBJECTS  
// ii) WE ARE GOING TO TALK ABOUT THE MOST COMMON STATIC FUNCTION : --------------------------------(1) ;
//           We can use the main function even without creating any object of this class and also main is the first thing that runs when we use the jvm compiler   
//           Because in order to run anything inside a class we have to create a object but since we donot have anyobject in main class so the problem that occurs is what is to be run 
//           Therefore we use Static keyword , because it is independent to objects and can run inside the class   

// (2) will give error because inside of STATIC FUNCTION we cannot use anything that is not STATIC 
//         i.e it can only access NON STATIC DATA : because 
// NOTE : NON STATIC DATA BELONGS TO OBJECTS : 
// THEREFORE (3) will not give error