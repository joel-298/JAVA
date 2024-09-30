// IN THIS FILE WE WILL COVER THE TOPICS OF 2D ARRAYs , Jagged ARRAYS(2D), and taking inputs 
// AND INBUILT FUNCTIONS like : .lenght() , .swap() , .sort() , .reverse() ; .toString() [data types conversion] 
// LEC 27 Kaprekar number 




import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize the data structures
        int[] array = new int[n];                 // 1D array
        List<Integer> arrayList = new ArrayList<>();  // ArrayList
        LinkedList<Integer> linkedList = new LinkedList<>();  // LinkedList
        Vector<Integer> vector = new Vector<>();  // Vector

        // Input elements and fill all data structures in a single loop
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();

            // Assign the element to each data structure
            array[i] = element;
            arrayList.add(element);
            linkedList.add(element);
            vector.add(element);
        }

        // Sort the 1D array (Ascending)
        Arrays.sort(array);
        System.out.println("1D Array in Ascending Order: " + Arrays.toString(array));

        // Sort the ArrayList (Ascending)
        Collections.sort(arrayList);
        System.out.println("ArrayList in Ascending Order: " + arrayList);

        // Sort the LinkedList (Ascending)
        Collections.sort(linkedList);
        System.out.println("LinkedList in Ascending Order: " + linkedList);

        // Sort the Vector (Ascending)
        Collections.sort(vector);
        System.out.println("Vector in Ascending Order: " + vector);

        // Sort the 1D array (Descending)
        Arrays.sort(array);
        reverseArray(array);  // Helper method to reverse the array
        System.out.println("1D Array in Descending Order: " + Arrays.toString(array));

        // Sort the ArrayList (Descending)
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("ArrayList in Descending Order: " + arrayList);

        // Sort the LinkedList (Descending)
        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println("LinkedList in Descending Order: " + linkedList);

        // Sort the Vector (Descending)
        Collections.sort(vector, Collections.reverseOrder());
        System.out.println("Vector in Descending Order: " + vector);
        
        scanner.close();
    }

    // Helper method to reverse an array
    public static void reverseArray(int[] array) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
