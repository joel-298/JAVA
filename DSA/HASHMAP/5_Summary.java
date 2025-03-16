import java.util.* ;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Map<String,Integer> hm = new HashMap<>() ;
        
        // ADD ELEMENT
		hm.putIfAbsent("Joel",1) ;
		hm.putIfAbsent("Kashish",2) ;
	    hm.putIfAbsent("jatin",3) ; 
        
        // PRINTING
		System.out.println(hm.entrySet()) ;
		for(String i : hm.keySet()) {
		    System.out.print(i+" ") ; 
		}
		System.out.println() ;
		for(String i : hm.keySet()) {
		    System.out.print(hm.get(i)+" ") ; 
		}
		
		
		System.out.println() ;
		// CONVERTING HASHMAP TO LIST AND SORTING IT 
		List<Map.Entry<String,Integer>> li = new ArrayList<>(hm.entrySet()) ; 
            // 1) printing !
		for(int i = 0 ; i < li.size() ; i++) {
		    System.out.print(li.get(i).getKey()+" : "+li.get(i).getValue()+", ") ; 
		}
		    // 2) Sorting in Ascending 
		System.out.println() ;
		Collections.sort(li,(a,b)->a.getValue()-b.getValue()) ; 
		for(int i = 0 ; i < li.size() ; i++) {
		    System.out.print(li.get(i).getKey()+" : "+li.get(i).getValue()+", ") ; 
		}
		    // 3) Sorting in Descending  
		System.out.println() ;
		Collections.sort(li,(a,b)->b.getValue()-a.getValue()) ; 
		for(int i = 0 ; i < li.size() ; i++) {
		    System.out.print(li.get(i).getKey()+" : "+li.get(i).getValue()+", ") ; 
		}


	}
}

// OUTPUT : 
// [jatin = 3, Kashish = 2, Joel = 1]
// jatin Kashish Joel
// 3 2 1
// jatin: 3, Kashish: 2, Joel: 1, 
// Joel: 1, Kashish: 2, jatin: 3, 
// jatin: 3, Kashish 2, Joel : 1