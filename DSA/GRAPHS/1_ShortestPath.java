class Graph{
public Map<Integer,List<Integer>> adj ; 
    // Constructor 
    public Graph(int n){
        adj = new HashMap<>() ;
        for(int i = 1 ; i <= n ; i++ ){
            adj.putIfAbsent(i,new ArrayList<>()) ;
        }
    }
    // Adding edges 
    public void addEdge(int u , int v) {
        adj.get(u).add(v) ;
    }
    // Solution 
    public int Solution(int n) {
        // 1) initilization 
        Map<Integer,Boolean> visited = new HashMap<>() ;
        for(int i:adj.keySet()) {
            visited.put(i,false) ;
        }
        Queue<int[]> q = new LinkedList<>() ; 
        visited.put(1,true) ;
        q.add(new int[]{1,0}) ; // 1 is the source node , depth        
        // 2) loop 
        while(!q.isEmpty()) {
            // a) initilization
            int [] current = q.poll() ;
            int node = current[0] ;
            int depth = current[1] ; 
            //b) return depth
            if(node == n) {
                return depth ; 
            }
            //c) loop on child nodes
            for(int i:adj.get(node)){
                if(!visited.get(i)) {
                    visited.put(i,true) ;
                    q.add(new int[]{i,depth+1}) ;
                }
            }
        }
        // 3) return 
        return -1 ; //path not found
    }
}
class Result{
  static int number_of_edges(int n){
      Graph g = new Graph(n) ;
        for(int i = 1 ; i <= n ; i++){
            if(i+1 <= n){
                g.addEdge(i,i+1) ;
            }
            if(3*i <= n){
                g.addEdge(i,3*i) ;
            }
        }
      return g.Solution(n) ;
  }
}