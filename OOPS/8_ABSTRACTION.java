// ABSTRACTION : Hiding complex implementation details and showing only the necessary features of an object.
// IN SIMPLE TERNMS : for exmple we are using some inbuilt functions but the they have a backend code which we do not really care about
// therefore it means hiding the backend details but only showing the frontend (hiding the implementation part)


// BASIC DIFFERENCE BETWEEN ENCAPSULATION AND ABSTRACTION : 
// Abstraction is solving the designing level issue and Encapsulation is solving the IMPLEMENTATION level issue
// Abstraction works on the external stuff and Encapsulation works on the internal stuff
// ABSTRACTION focus on Data security through DATA HIDING and ENCAPSULATION focus on Hiding the complexity of system 
//             for example a provate keyword inside a class is an exmple of Data Hiding






// CASE 1
abstract class CAR { //--------------------------------------------(3)
    // public void drive() { // ------------------(1)
    //     // why creating a car which cannot drive // i.e this function is not performing anything
    // } 
    
    public abstract void drive() ; // DECLARING ---------------------------------------(2)

    public void playmusic(){
        System.out.println("PLAY MUSIC") ;
    }
}

class WagnoR extends CAR { // ----------------------(2)
    public void drive() { 
        System.out.println("DRIVE CAR") ; 
    }
}


public class Main {
    public static void main(String[] args){
        // CAR obj = new CAR() ;  // -------------------------(4)
        CAR obj = new WagnoR() ;  // -------------------------(5)
        obj.drive() ;   
        obj.playmusic() ; 
    }
}



// EXPLANATION : 
// (2) is responsible for the car to drive i.e WagnoR->drive() ; through method/function overriding
// (3) class will have to be changed to abstract class 
// (4) we cannot create an object of an ABSTRACT CLASS THEREFORE we have to create a object of class CAR which will have the properties of WAGNOR (5)
// EXPLAINED IN STORY FORMAT : 
// we have a class naed CAR which has a feature which not working so we have just declared it through abstract keyword , and since we have declared it 
// through abstract keyword then we also have to make it an abstract class , and since the class is abstract then look at the (4) and (5)th step, 
// now AFTER declaration we have created another class which extends this abstract feature and provide this feature through function/method overriding, 
// Therefore , our WAGNOR CAR can drive and also play music  



// NOTE : now if we also want to add a fly feature in out wagnor then look at CASE 2: 
// CASE 2 
abstract class CAR { 
    // public void drive() { // ------------------(1)
    //     // why creating a car which cannot drive // i.e this function is not performing anything
    // } 
    
    public abstract void drive() ; // DECLARING 
    public abstract void fly() ; 
    public void playmusic(){
        System.out.println("PLAY MUSIC") ;
    }
}

abstract class WagnoR extends CAR {  // ---------------------------(6)
    public void drive() { 
        System.out.println("DRIVE CAR") ; 
    }
}
class UpdateWagnor extends WagnoR{
    public void fly() {
        System.out.println("CAN FLY") ;
    }
}


public class Main {
    public static void main(String[] args){
        // CAR obj = new CAR() ;  
        // CAR obj = new WagnoR() ;  
        CAR obj = new UpdateWagnor() ;   // --------------------------(6)
        obj.drive() ;   
        obj.playmusic() ; 
        obj.fly() ;
    }
}

// Since we have extended Wagnor in UpdateWagnor and we are using fly from CAR through WAGNOR therefore we also had to make WagnoR class ABSTRACT