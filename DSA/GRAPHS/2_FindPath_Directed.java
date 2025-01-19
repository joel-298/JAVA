// find path in directed graph 
import java.util.* ;  
import java.util.Scanner;

class Graph{
public Map<Integer,List<Integer>> adj ;
    // constructor 
    public Graph(int nodes){
        adj = new HashMap<>() ;
        for(int i = 0 ; i < nodes ; i++){
            adj.putIfAbsent(i,new ArrayList<>()) ;
        }
    }
    // Create graph
    public void addEdge(int u, int v) {
        adj.get(u).add(v) ;
    }
    // algorithm
    public boolean Check(int source , int destination){
        Map<Integer,Boolean> visited = new HashMap<>(); // create a visited hashmap with initial value false
        for(int it:adj.keySet()){
            visited.put(it,false) ;
        }
        Queue<Integer> q = new LinkedList<>();  // initilization
        q.add(source) ;
        visited.put(source,true) ;
        while(!q.isEmpty()) { // loop
            int node = q.poll() ; 
            if(node == destination){
                return true ; 
            }
            // Check if the node has neighbors
            if (adj.get(node) != null) {
                for(int it:adj.get(node)){ 
                    if(!visited.get(it)) { // if not visited
                        q.add(it) ;
                        visited.put(it,true) ;
                    }
                }           
            }
            else{
                continue ; 
            }
        }
        
        // return
        return false ;        
    }
}

class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        Graph g = new Graph(n) ;
        for(int i = 0 ; i < m ; i++){
            int u = sc.nextInt() ;
            int v = sc.nextInt() ;
            g.addEdge(u,v) ;
        }
        int source = sc.nextInt() ;
        int destination = sc.nextInt() ;
        if(g.Check(source,destination)) {
            System.out.print("YES") ;
        }
        else{
            System.out.print("NO") ;
        }
    }
}