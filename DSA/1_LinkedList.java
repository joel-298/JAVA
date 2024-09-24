//      COLLECTION FRAMEWORK :  
// LIST CONSISTS OF 4 sub classes , ARRAY , LINKED LIST , VECTOR , STACK 
// i) LINKED LIST : GENERIC i.e we have to define the datatype (TEMPLATE)
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListExample {  // Rename the class to avoid conflict
    public static void main(String[] args) {
        List<String> linkedlist = new LinkedList<>();  // Use the Java LinkedList

        // Add elements to the LinkedList
        linkedlist.add("JOEL");
        linkedlist.add("KASHISH");
        linkedlist.add("NISHU");

        // Remove element at index 1 ("KASHISH")
        linkedlist.remove(1);

        // Print the size of the LinkedList
        System.out.println("SIZE: " + linkedlist.size());

        // Print the first element (front)
        System.out.println("FIRST ELEMENT: " + linkedlist.get(0));

        // Print the last element (back)
        System.out.println("LAST ELEMENT: " + linkedlist.get(linkedlist.size() - 1));

        // Iterate through the LinkedList using an iterator
        Iterator<String> iterator = linkedlist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // Clear the LinkedList
        linkedlist.clear();
    

        // Check if the LinkedList is empty
        System.out.println("IS LINKED LIST EMPTY ? " + linkedlist.isEmpty());
    }
}



// OUTPUT : 
// SIZE: 2
// FIRST ELEMENT: JOEL
// LAST ELEMENT: NISHU
// JOEL
// NISHU
// IS LINKED LIST EMPTY ? true" 

// === Code Execution Successful ===