// HASHSET : 

import java.util.HashSet ; 
import java.util.TreeSet;             // ---(3)
import java.util.Comparator;          // ---(3)

public class Main { 
    public static void main(String[] args){

        HashSet <String> hashSet = new HashSet<>();
        hashSet.add("G10") ; 
        hashSet.add("G9")  ;
        hashSet.add("G11") ;
        System.out.println(hashSet) ; 
        hashSet.add("G10") ; //------------------------------(1)
        System.out.println(hashSet) ;
        // print size 
        System.out.println(hashSet.size()) ;




        HashSet <Integer> hashSet2 = new HashSet<>(); // --------------------(2)
        hashSet2.add(1) ; 
        hashSet2.add(10)  ;
        hashSet2.add(5) ;
        System.out.println(hashSet2) ; 
        hashSet2.add(5) ; 
        System.out.println(hashSet2) ;
        System.out.println(hashSet2.size()) ;


        TreeSet<Integer> hashSet3 = new TreeSet<>(Comparator.reverseOrder()); // --------------------(3)
        hashSet3.add(1) ; 
        hashSet3.add(10)  ;
        hashSet3.add(5) ;
        System.out.println(hashSet3) ; 
        hashSet3.add(5) ; 
        System.out.println(hashSet3) ;
        System.out.println(hashSet2.size()) ;


        // UNION OF 2 HASH-SETS : 
        HashSet <String> hashSet4 = new HashSet<>();
        hashSet4.add("G10") ; 
        hashSet4.add("G9")  ;
        hashSet4.add("G12") ; 

        HashSet <String> union = new HashSet<>(hashSet) ; 
        union.addAll(hashSet4) ;
        System.out.println(union) ; 

        // INTERSECTION 
        HashSet <String> intersection = new HashSet<>(hashSet) ; 
        intersection.retainAll(hashSet4) ;
        System.out.println(intersection) ; 

        // DIFFERENCE  
        HashSet <String> Difference_a = new HashSet<>(hashSet) ;   // hashSet - hashSet4
        Difference_a.removeAll(hashSet4) ; 
        System.out.println(Difference_a) ;
        HashSet <String> Difference_b = new HashSet<>(hashSet4) ; // hashSet4 - hashSet
        Difference_b.removeAll(hashSet) ; 
        System.out.println(Difference_b) ;




        // PRESERVING ORDER : 
        
    


    }
}

// EXPLANATIONS :
// (1) will not get added and size will not increase because set does not contains dublicates
// (2) By default in case of Integer it will arrage in Ascending Order
// (3) REPRESENTS DESCENDING ORDER