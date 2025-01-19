public void DFS(int source, Map<Integer,Boolean> visited, Stack<Integer> s){
    visited.put(source, true) ;
    for(int i:adj.get(source)){
        if(!visited.get(i)){
            DFS(i,visited,s) ;
        }
    }
    s.push(source) ;

}
public void Topological(){
    Map<Integer,Boolean> visited = new HashMap<>() ;
    for(int i : adj.keySet()) {
        visited.put(i,false) ;
    } 
    Stack<Integer> s = new Stack<>() ;
    for(int i:adj.keySet()) {
        if(!visited.get(i)) {
            DFS(i,visited,s) ;
        }
    }
    // printing
    while(!s.isEmpty()) {
        if(s.size() != 1) {
            System.out.print(s.peek()+" ") ;
            s.pop() ;
        }
        else{
            System.out.print(s.peek()) ;
            s.pop() ;
        }
    }

}


// GFG THROUGH ARRAYLIST<ARRAYLIST<INTEGER>> ADJ
class Solution {
    public static void DFS(int source , Map<Integer,Boolean> visited , Stack<Integer> s , ArrayList<ArrayList<Integer>> adj){
        visited.put(source,true) ; 
        for(int i : adj.get(source)) { // SIMILAT TO MAP
            if(!visited.get(i)) {
                DFS(i,visited,s,adj) ;
            }
        }
        s.push(source) ; 
    }
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size() ;
        Map<Integer,Boolean> visited = new HashMap<>() ;
        for(int i = 0; i < n; i++){
            visited.put(i,false) ;
        }
        Stack<Integer> s = new Stack<>() ;
        for(int i = 0; i < n; i++) {
            if(!visited.get(i)) {
                DFS(i,visited,s,adj) ;
            }
        }
        // printing
        ArrayList<Integer> result = new ArrayList<>() ;
        while(!s.isEmpty()) {
            result.add(s.pop()) ;
        }
        // RETURN 
        return result ; 
    }
}