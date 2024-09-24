// DOUBT : 


// SINGLETON CLASS :
// A Singleton class in Java ensures that only one object of the class can be created, and that same object is used everywhere in the program.




class SINGLETON{
    private SINGLETON(){ // private means this will only be used in this file only

    }

    private SINGLETON instance;
    public static SINGLETON getInstance(){

    }
}


public class Main {
    public static void main(String[] args){
        SINGLETON obj = SINGLETON.getInstance() ; 

    }
}