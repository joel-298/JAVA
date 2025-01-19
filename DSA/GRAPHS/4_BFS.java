void BFS(int source) 
{ 
    // 1) Initilization
    Map<Integer,Boolean> visited = new HashMap<>(); // visited map
    for(int it:adjVertices.keySet()) {
        visited.put(it,false) ;
    }
    Queue<Integer> q = new LinkedList<>() ; // queue
    q.add(source) ; 
    visited.put(source,true) ;
    List<Integer> result = new ArrayList<>() ; // result vector
    result.add(source) ;
    // 2) BFS
    while(!q.isEmpty()){
        int node = q.poll() ; // also remove from the queue
        for(int it:adjVertices.get(node)){
            if(!visited.get(it)){
                result.add(it) ;
                visited.put(it,true) ;
                q.add(it) ;
            }
        }
    }
    // 3) printing 
    for(int i = 0 ; i < result.size() ; i++){
        if(i != result.size() - 1){
            System.out.print(result.get(i)+" "); 
        }
        else{
            System.out.print(result.get(i));            
        }
    }
} 
