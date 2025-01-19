import java.util.* ; 
import java.io.* ;

class Graph {
public Map<Integer,List<Integer>> adj ; 
    public Graph(int n) {
        adj = new HashMap<>() ;
        for(int i = 0 ; i < n ; i++ ){
            adj.putIfAbsent(i,new ArrayList<>()) ;
        }
    }
    public void addEdge(int u , int v) {
        adj.get(u).add(v) ; 
        adj.get(v).add(u) ;
    }
    // ALGO
    public boolean DFS(int source, int parent , Map<Integer,Boolean> visited) {
        visited.put(source, true) ; 
        for(int i:adj.get(source)){
            if(!visited.get(i)) {
                if(DFS(i,source,visited)) {
                    return true ; 
                }
            }
            else if(i != parent) {
                return true ;  // CYCLE IS PRESENT
            }
        }
        return false ; 
    }
    public boolean CYC(){
        Map<Integer, Boolean> visited = new HashMap<>() ;
        for(int i:adj.keySet()) {
            visited.put(i,false) ;
        }
        for(int i:adj.keySet()) {
            if(!visited.get(i)) {
                if(DFS(i,-1,visited)){ // passing source for the first time 
                    return true ; 
                }
            }
        }
        return false ; 
    }
}
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m =  sc.nextInt() ; 
        Graph g = new Graph(n) ;
        for(int i = 0 ; i < m ; i++ ){
            int u =  sc.nextInt() ; 
            int v =  sc.nextInt() ;
            g.addEdge(u,v) ;
        }
        if(g.CYC()){
            System.out.print("Yes") ;
        }
        else{
            System.out.print("No") ;
        }
    }
}