// STACK :  LIFO (Last In, First Out)
// ( Inside of collections -> LIST)


import java.util.List ; 
import java.util.Stack ; 

public class Main { 
    public static void main(String[] args){
        // List<Integer> stack = new Stack<>() ;     -----------------> (1)
        Stack<Integer> stack = new Stack<>() ;       //---------------> (2)         


        stack.push(10) ; 
        stack.push(20) ;      
        stack.push(30) ; 
        stack.push(40) ;   
        System.out.println("POP : "+stack.pop())  ;          // ----------------> (3)
        System.out.println("SIZE : "+stack.size()) ;
        System.out.println("PEEK : "+stack.peek()) ;
        System.out.println("SIZE : "+stack.size()) ; 
    }
}


// EXPLANATIONS : 
// (1) this line will give error because we are making object from parent and then we are not being able to access the functions/methods of child i.e stack 
//      SO its always better to use (2) , and we can also use this in '1_LINKEDLIST' file 
// (3)  this pop function will return the value algong with deleting it , so its opposite from cpp.