// EXAMPLE OF A MAX HEAP ONLY
import java.util.* ; 


class Heap { 
public List<Integer> li ; 
    public Heap() {
        li = new ArrayList<>() ; 
    }
    // INSERT
    public void INSERT(int data){ 
        li.add(data) ; 
        HEAPIFY_UP(li.size() - 1) ; // passing the last index
    }
    // HEAPIFY-UP FUNCTION 
    public void HEAPIFY_UP(int index) {
        while(index > 0) {
            int parent = (index-1)/2 ; 
            if(li.get(index) > li.get(parent)) { 
                int temp = li.get(index) ; 
                li.set(index,li.get(parent)) ;  // SWAP  
                li.set(parent,temp) ;           // SWAP
                index = parent ;                // MOVE UP : (usually we do parent = index but here we do index = parent)
            }
            else{
                break ; // stop if heap property is restored !
            }
        }
    }
    // DELETE
    public int DELETE() {
        if(li.size() != 0) {
            // 1) STORE THE RETURNING ELEMENT 
            int delete = li.get(0) ; 
            // 2) SWAP THE FIRST AND THE LAST
            int temp = li.get(0) ;               // SWAP
            li.set(0, li.get(li.size() -1)) ;    // SWAP
            li.set(li.size()-1,temp) ;           // SWAP
            // 3) REMOVE THE LAST
            li.remove(li.size() -1) ; 
            // 4) CALL THE NORMAL HEAPIFY FUNCTION : Instead of creating a for loop just send the variable from where we want to heapify 
            HEAPIFY(li,0,li.size()-1) ;  
            return delete ;
        }
        return -1;
    }
    // HEAPIFY
    public void HEAPIFY(List<Integer> li, int index , int n) {
        int Parent = index ; 
        int Left = Parent * 2 + 1 ; 
        int Right = Parent * 2 + 2 ;
        if(Left <= n && li.get(Parent) < li.get(Left)) {
            Parent = Left ; 
        } 
        if(Right <= n && li.get(Parent) < li.get(Right)) {
            Parent = Right ; 
        }
        if(Parent != index) {
            int temp = li.get(index) ; 
            li.set(index,li.get(Parent)) ; 
            li.set(Parent,temp) ; 
            HEAPIFY(li,Parent,n) ; 
        }
    }

    // DISPLAY
    public void DISPLAY() {
        if(li.size() == 0) {
            System.out.print("-1 empty") ; 
        }
        for(int i = 0 ; i < li.size() ; i++) {
            System.out.print(li.get(i)+" ") ; 
        }
        System.out.println() ; 
    }
}

public class Main {
    public static void main(String [] args) {
        int [] arr = {1,5,4,2,3,6,8,9,100,200} ; 
        Heap obj = new Heap() ; 
        for(int i = 0 ; i < arr.length ; i++) {
            obj.INSERT(arr[i]) ; 
        }
        obj.DISPLAY() ; 




        int deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 
        deleted_Node = obj.DELETE() ; // just delete the top element ; 
        System.out.print(deleted_Node+" -> ") ; 
        obj.DISPLAY() ; 

    }
}

// // OUTPUT : 
// 200 100 6 8 9 4 5 1 3 2
// 200 -> 100 9 6 8 2 4 5 1 3
// 100 -> 9 8 6 3 2 4 5 1 
// 9 -> 8 3 6 1 2 4
// 8 -> 6 3 5 1 2 4
// 6 -> 5 3 4 1 2
// 5 -> 4 3 2 1
// 4 -> 3 1 2
// 3 -> 2 1
// 2 -> 1 
// 1 -> -1 empty
// -1 -> -1 empty


// PSEUDO CODE FOR INSERTION IN O(log(n)) 

// CREATE A CLASS, with List<Integer> as object parameter
// ADD element in this list 
// call HEAPIFY FUNCTION : but instead of traditional heapify function 
// CALL HEAPIFY UP FUNCTION 
//          ->  func ( int index ) -------------------> index = INDEX OF LAST ELEMENT OF LIST
//                  while (index > 0) {
//                      int parent = (index-1/2)
//                      if(li.get(index) > li.get(parent)) {
//                          SWAP(li.get(index),li.get(parent)) ; 
//                          index = parent ; 
//                          func (index) ; 
//                      }
//                      else{
//                          break 
//                      }
//                  } 


// PSEUDO CODE FOR DELETION 
// DELETE THE TOP AND REMOVE THE LAST
// CALL THE NORMAL, TRADITIONAL HEAPIFY FUNCTION ! 