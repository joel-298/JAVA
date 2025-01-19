//                                                                   GFG
//1) 0 INDEXING
//2) FLOW CONTROL : 
        // Initilization , distance array and set
        // formula  
            // top if set
            // loop on child
                // if()
                    // pop form set
                // update set and distance array
                
        // return 
// 3)INPUT  adj = [[[1, 1], [2, 6]], [[2, 3], [0, 1]], [[1, 3], [0, 6]]], src = 2 
// 4) index of row represents node , [destination,weight]

import java.util.* ; 
import java.io.* ; 
import java.lang.* ; 

class Pair{
public int first , second ; 
    public Pair(int first , int second) {
        this.first = first ; 
        this.second = second ; 
    }
}
class Graph {  
public ArrayList<ArrayList<Pair>> adj ; // correct this line only
    public Graph(int n) {
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Pair>());
        }
    }
    // Method to directly add the adjacency list (edges with weights)
    public void addEdgesFromInput(Scanner sc, int m) {
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); // Node u
            int v = sc.nextInt(); // Node v
            int weight = sc.nextInt(); // Weight of the edge
            adj.get(u).add(new Pair(v, weight)); // Add edge u -> v
            adj.get(v).add(new Pair(u, weight)); // Add edge v -> u (for undirected graph)
        }
    }

    public void DIJKSTRAS(int source){
        ArrayList<Integer> distance = new ArrayList<>() ;
        for(int i = 0 ; i < adj.size() ; i++) {
            distance.set(i,Integer.MAX_VALUE) ;
        }
        distance.set(source,0) ;
        PriorityQueue<Pair> s = new PriorityQueue<>((a,b)->a.first-b.first) ; // min heap based on 1st element of pair
        s.offer(new Pair(0,source)) ;

        while(!s.isEmpty()) {
            Pair current = s.poll() ;
            int dist = current.first ; 
            int u = current.second ; 
            for(Pair j : adj.get(u)) {
                int v = j.first ; 
                int weight = j.second ; 
                if(distance[u] != Integer.MAX_VALUE && distance[v] > dist + weight) {
                    distance.set(v , dist + weight) ;
                    s.offer( new Pair( distace.get(v) , v) ) ;
                }
            }
        }             
    }
}
public class Main() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n , m  ;
        n = sc.nextInt() ;
        m = sc.nextInt() ;
        Graph g = new Graph(n) ;

        // Read the graph input directly as adjacency list
        g.addEdgesFromInput(sc, m);

        int source = sc.nextInt() ;
        g.DIJKSTRAS(source) ;
    }
}


// initilization : arraylist , set/priorityqueue
// loop 
    // pop from queue
    // for loop on childs 
    // formula {  1) update distance , 2) add in queue}
// return 









// I DONT KNOW IF THIS WHOLE CODE FROM SCRATCH IS CORRECT ? 