static int spanningTree(int n, int E, List<List<int[]>> adj) {
    // 1) INITILIZATION 
    int [] keys = new int [n] ;
    boolean [] mst = new boolean[n] ;
    int [] parent = new int [n] ;
    parent[0] = -1 ; 
    for(int i = 0 ; i < n ; i++){
        keys[i] = Integer.MAX_VALUE ; 
    }
    keys[0] = 0 ;
    // 2) ALGO 
    for(int i = 0 ; i < n ; i++) {
        int mini = Integer.MAX_VALUE ; 
        int u = -1 ; 
        // a) find mini value 
        for(int j = 0 ; j < n ; j++) {
            if(mst[j] == false && mini > keys[j]) {
                mini = keys[j] ;
                u = j ;
            }
        }
        // b) mst true 
        mst[u] = true ; 
        // c) formula 
        for(int[] j:adj.get(u)) { // in 1st iteration v = 1 , weight = 5 , int 2nd iteration v = 2 , weight = 1
            int v = j[0] ;
            int weight = j[1] ;
            if(mst[v] == false && weight < keys[v]) {
                parent[v] = u ;
                keys[v] = weight; 
            }
        }
    }
    
    // 3) SUM 
    int sum = 0 ;
    for(int i = 0 ; i < n ; i++) {
        sum += keys[i] ; 
    }
    return sum ; 
}



// Explanation:
// adj[0]: Edges from vertex 0
//     [1, 5]: Vertex 1 with weight 5.
//     [2, 1]: Vertex 2 with weight 1.
// adj[1]: Edges from vertex 1
//     [0, 5]: Vertex 0 with weight 5.
//     [2, 3]: Vertex 2 with weight 3.
// adj[2]: Edges from vertex 2
//     [0, 1]: Vertex 0 with weight 1.
//     [1, 3]: Vertex 1 with weight 3.

// Visualization of the Adjacency List:
// 0 -> [(1, 5), (2, 1)]
// 1 -> [(0, 5), (2, 3)]
// 2 -> [(0, 1), (1, 3)]

// Final Note:
// The adjacency list is symmetric for undirected graphs since every edge is represented twice: once for each endpoint.