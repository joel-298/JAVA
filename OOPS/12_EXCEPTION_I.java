// SIMPLE AGE EXCEPTION : 

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int age;
        Scanner sc =new Scanner(System.in);
        age = sc.nextInt();

        try
        {
            if(age < 0)
                throw new Exception("Age can not be negative");
            System.out.println("Correct Age");
        }
        catch(Exception e){
            System.out.println("Age can be positive only");
            System.out.println() ; 
            e.printStackTrace();
            System.out.println() ; 
            System.out.println(e.getMessage());
            System.out.println() ; 
            System.out.println(e.toString());
            System.out.println() ; 
        }
        finally {
            System.out.println("Finally Block");
        }
    }
}




// OUTPUT :- 

// -1
// Age can be positive only

// java.lang.Exception: Age can not be negative
// 	at ExceptionDemo.main(ExceptionDemo.java:12)

// Age can not be negative

// java.lang.Exception: Age can not be negative

// Finally Block

// === Code Execution Successful ===