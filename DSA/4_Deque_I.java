// DEQUE : 
// DIFFERENCE BETEEN QUEUE AND DEQUE : in DEQUE we can work with both of the ends and in QUEUE e can only work with the front

import java.util.ArrayDeque ; 

public class Main {
    public static void main(String[] args){
        ArrayDeque <Integer> arr = new ArrayDeque<>() ; 

        arr.offer(20) ; 
        arr.offer(40) ; 
        arr.offer(10) ;

        System.out.println(arr.peek()) ;

        arr.addFirst(50) ;
        // 50 20 40 10 
        System.out.println(arr.peek()) ; 
        arr.removeLast() ; // 10
        // 50 20 40
        arr.addLast(60) ;
        // 50 20 40 10 60
        System.out.println(arr.peekLast()) ; //60 // i want here to peek the last
    }

}