// SORT A HASHMAP USING LIST : 



// STEP 1 : INITILIAZE A LIST OF ENTRIES OF A HASHMAP ! 
import java.util.* ; 

public class Main
{
	public static void main(String[] args) {
	    Map<String,Integer> map= new HashMap<>() ; 
	    for(int i =0 ; i < 2 ; i++) {
	        if(i == 0) {
	            map.putIfAbsent("Joel",0) ;  
	            continue ;
	        }
	        map.putIfAbsent("Kashish",0) ; 
	    }
	    

	    System.out.println(map.entrySet()) ;  // will return : 	[Kashish=0 , Joel=0]
	    
	    // Create an List based on these entries 
	    List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet()) ; 
        //   Initilization that each element inside this list is going to be a entry of a map with Key : Value : String : Integer
        //   Appending all of the maps value to this list through (map.entrySet) ; 
        //   .entrySet => returns all of the Maps entries ..... 
	   
	   for(int i = 0 ; i < map.size() ; i++) {
	       System.out.println(list.get(i)+" => Key : "+list.get(i).getKey()+" : Value : "+list.get(i).getValue()) ; 
	   }
	}
}