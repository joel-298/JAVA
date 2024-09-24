// HASHMAPS : not a part of COLLECTION INTERFACE 

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Fruit", 40);
        map.put("Apple", 20);  // value updated
        map.put(null, 10);
        map.put("Mango", null);
        map.put(null, null);

        System.out.println(map);
        map.remove(null);        // removes the null key-value pairs
        System.out.println( map);

        // FOR-EACH LOOP 
        System.out.println("ITERATING THROUGH THE MAP :");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
