import java.util.* ; 
import java.io.* ;

class Graph {
public Map<Integer,List<Integer>> adj ;
    public Graph(int n) {
        adj = new HashMap<>() ;
        for(int i = 0 ; i < n ; i++) {
            adj.putIfAbsent(new ArrayList<>()) ;
        }
    }
    public void addEdge(int u, int v) {
        adj.get(u).add(v) ;
    }
    public boolean DFS(int source, Map<Integer,Boolean> visited , Map<Integer, Boolean> dfs_visited) {
        visited.put(source,true) ;
        dfs_visited.put(source,true) ;
        for(int i:adj.get(source)) {
            if(!visited.get(i) && DFS(i,visited,dfs_visited)){
                return true ; 
            }
            else if (dfs_visited.get(i) != false) {
                return true ; 
            }
        }
        dfs_visited.put(source,false) ;
        return false ; 
    }
    public boolean isCyclic(){
        Map<Integr,Boolean> visited = new HashMap<>() ;
        Map<Integr,Boolean> dfs_visited = new HashMap<>() ;
        for(int i:adj.keySet()) {
            visited.put(i,false) ;
            dfs_visited.put(i,false) ;
        }
        for(int i:adj.keySet()) {
            if(!visited.get(i)) {
                if(DFS(i,visited,dfs_visited)){
                    return true ; 
                }
            }
        }
        return false ; 
    }
};
public class Main() {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        Graph g = new Graph(n) ;
        for(int i = 0 ; i < m ; i++) {
            int  u = sc.nextInt() ; 
            int v = sc.nextInt() ;
            g.addEdge(u,v) ;
        }
        // int source = sc.nextInt() ;
        if(g.isCyclic()){
            System.out.print("YES") ;
        } 
        else{
            System.out.print("NO") ;
        }
    }
}



// BELLMAN : distance array 
// PRIMS : keys , mst , parent 
// Dijkstras : distance set 