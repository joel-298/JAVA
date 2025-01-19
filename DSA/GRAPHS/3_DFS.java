void DFSUtil(int source, Map<Integer,Boolean> visited, List<Integer> result) 
{ 
    visited.put(source,true) ; 
    result.add(source) ;
    for(int it:adjVertices.get(source)){
        if(!visited.get(it)) {
           DFSUtil(it,visited,result);
        }
    }
} 

void DFS(int source) { 
    Map<Integer,Boolean> visited = new HashMap<>() ;
    for(int it:adjVertices.keySet()) {
        visited.putIfAbsent(it,false) ;
    }
    List<Integer> result = new ArrayList<>() ; 
    // call the recursive function and pass source first
    DFSUtil(source,visited,result) ;
    // printing
    for(int i = 0 ; i < result.size() ; i++) {
        if(i != result.size() -1 ){
            System.out.print(result.get(i)+" ") ;
        }
        else{
            System.out.print(result.get(i)) ;        
        }
    }
} 
