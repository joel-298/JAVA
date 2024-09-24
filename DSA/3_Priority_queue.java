// PRIORITY QUEUE : by default MIN-HEAP 


// MIN HEAP 
import java.util.PriorityQueue ; 

public class Main {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>() ; 

        pq.offer(20) ; 
        pq.offer(10) ; 
        pq.offer(40) ;

        System.out.println(pq.peek()) ;
        pq.remove() ; 
        System.out.println(pq.peek()) ; 
    }
}


// MAX HEAP 
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(20);
        pq.offer(10);
        pq.offer(40);


        System.out.println(pq.peek());  // Output: 40
        pq.remove();
        System.out.println(pq.peek());  // Output: 20
    }
}