// ALGO
public boolean DFS(int source, Map<Integer,Boolean> visited,  Map<Integer,Boolean> dfs_visited) {
    visited.put(source, true) ; 
    dfs_visited.put(source,true) ;
    for(int i:adj.get(source)){
        if(!visited.get(i) && DFS(i,visited,dfs_visited)) {
            return true ; 
        }
        else if(dfs_visited.get(i)) { // dfs_visited is already true
            return true ;  // CYCLE IS PRESENT
        }
    }
    dfs_visited.put(source, false) ;
    return false ; 
}
public boolean CYC(){
    Map<Integer, Boolean> visited = new HashMap<>() ;
    Map<Integer, Boolean> dfs_visited = new HashMap<>() ;
    for(int i:adj.keySet()) {
        visited.put(i,false) ;
        dfs_visited.put(i,false) ;
    }
    for(int i:adj.keySet()) {
        if(!visited.get(i)) {
            if(DFS(i,visited,dfs_visited)){ // passing source for the first time 
                return true ; 
            }
        }
    }
    return false ; 
}