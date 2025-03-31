// WORLS AS A SET : Contains unique elements !
// TIME COMPLEXITY : 
    // INSERT/ADD : O(1) 
    // SEARCH : O(1) 
    // DELETE : O(1) 

// FUNCTIONS : 
    // .add(value) 
    // .contains(value)
    // .remove(value)
import java.util.* ; 

public class Main {
    public static void main(String[] args) {
        // INITIALIZE
            HashSet<Integer> h = new HashSet<>() ; 
        // ADD
            h.add(1) ; 
            h.add(2) ; 
            h.add(3) ; 
        // SEARCH
            System.out.println(h.contains(3)) ; 
        // DELETE
            h.remove(3) ; 

        System.out.println(h) ; 
        h.add(3) ; 
        h.add(3) ; // will ignore dublicate value and do not add it into itself
        System.out.println(h) ; 
        System.out.println() ; 

        // PRINT
        for(int i : h) {
            System.out.print(i+" ") ; 
        }
    }
}

// OUTPUT : 
// true
// [1, 2]
// [1, 2, 3]
// 1 2 3