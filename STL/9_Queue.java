import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // Add elements
        q.add(10);
        q.add(20);
        q.add(30);

        // Size
        System.out.println(q.size());

        // Print queue
        System.out.println(q);

        // Look at front element
        System.out.println(q.peek());

        // Remove front element
        System.out.println(q.remove());

        // Look at front again
        System.out.println(q.peek());

        // Check if empty
        System.out.println(q.isEmpty());

        // Check if element exists
        System.out.println(q.contains(20));
    }
}
