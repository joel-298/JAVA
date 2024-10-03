// ARRAY LIST : 


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        System.out.println("Size of ArrayList: " + arrayList.size());

        arrayList.remove((Integer) 200);
        System.out.println("ArrayList after removal: " + arrayList);


        arrayList.add(1, 150);
        System.out.println("Element at index 1: " + arrayList.get(1));

        arrayList.set(2, 350);
        System.out.println("ArrayList after set: " + arrayList);

        Iterator<Integer> iterator = arrayList.iterator();
        System.out.println("Iterating through ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}