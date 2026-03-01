// LEETCODE 191
// COUNT SET BIT i.e count number of occurences of 1 in a bit number 


// APPROACH 1 : Right shift and AND operator and count ! 
import java.util.* ; 

public class Main{
    public static void main(String[] args) {
        int n = 84 ;
        int count = 0 ; 
        while(n!=0) {                           // THIS LOOP WILL RUN 8 TIMES 
            if((n&1)==1) {
                count++ ; 
            }
            n = n>>1 ; 
        }
        System.out.println(count) ; 
    }
}

// APPROACH 2 : 
import java.util.* ; 

public class Main{
    public static void main(String[] args) {
        int n = 84 ;
        int count = 0 ;     
        while(n!=0) {                           // THIS LOOP WILL RUN 3 TIMES ONLY i.e NUMBER OF OCCURENCE OF 1 
            n = n&(n-1) ; 
            count++ ; 
        }
        System.out.println(count) ; 
    }
}