// DEQUE : 
// DIFFERENCE BETEEN QUEUE AND DEQUE : in DEQUE we can work with both of the ends and in QUEUE e can only work with the front

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Create an ArrayDeque
        ArrayDeque<Integer> arr = new ArrayDeque<>();

        // Adding elements using offer (adds to the end of the deque)
        arr.offer(20);  // 20
        arr.offer(40);  // 20, 40
        arr.offer(10);  // 20, 40, 10
        
        System.out.println("Initial deque: " + arr);

        // Peek the first element (does not remove it)
        System.out.println("Peek first element: " + arr.peek());  // 20

        // Add elements at the beginning and end
        arr.addFirst(50);  // 50, 20, 40, 10
        arr.addLast(60);   // 50, 20, 40, 10, 60
        
        System.out.println("After adding 50 at the start and 60 at the end: " + arr);

        // Remove the last element
        arr.removeLast();  // 50, 20, 40, 10
        System.out.println("After removing last element: " + arr);

        // Remove the first element
        arr.removeFirst();  // 20, 40, 10
        System.out.println("After removing first element: " + arr);

        // Get the first and last elements without removing
        System.out.println("First element: " + arr.getFirst());  // 20
        System.out.println("Last element: " + arr.getLast());    // 10

        // Poll removes and returns the first element (same as removeFirst)
        int polledElement = arr.poll();  // 40, 10
        System.out.println("Polled element: " + polledElement);
        System.out.println("After polling first element: " + arr);

        // Check if deque contains a specific element
        boolean contains40 = arr.contains(40);
        System.out.println("Does deque contain 40? " + contains40);

        // Add some more elements to demonstrate clear
        arr.offer(70);
        arr.offer(80);
        System.out.println("Deque before clearing: " + arr);

        // Clear the deque
        arr.clear();
        System.out.println("Deque after clearing: " + arr.isEmpty());
    }
}
