import java.util.* ; 
import java.io.* ; 

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> min = new PriorityQueue<>() ; // MIN HEAP parent node <= equal to its child nodes
        PriorityQueue<Integer> max = new PriorityQueue<>((a,b)->b-a) ; // MAX HEAP :  parent node >= equal to its child nodes
    }
};