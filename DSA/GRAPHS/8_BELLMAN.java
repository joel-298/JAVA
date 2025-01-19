// BEST WAY IS TO MAKE ADJENCY LIST USING 2D MATRIX of [m][3] => [u,v,weight] ; 
static int[] bellmanFord(int n , int[][] edges, int src) {
    // STEP 1 INITIALIZATION : 
    int[] distance = new int[n]; 
    for(int i = 0; i < n; i++) {
        distance[i] = 100000000; // consider this as a max value
    }
    distance[src] = 0; // Set the source node distance to 0
    
    // STEP 2 LOOP TILL N-1 
    for(int i = 0; i < n - 1; i++) { // Loop for n-1 iterations (correct range)
        for(int j = 0; j < edges.length; j++) {
            int u = edges[j][0]; 
            int v = edges[j][1];
            int weight = edges[j][2]; 
            
            // Relax the edge if the current path is shorter
            if(distance[u] !=  100000000 && distance[u] + weight < distance[v]){
                distance[v] = distance[u] + weight; 
            }
        }
    }
    // STEP 3 CHECK FOR CYCLES (Negative weight cycles detection)
    for(int j = 0; j < edges.length; j++) {
        int u = edges[j][0]; 
        int v = edges[j][1];
        int weight = edges[j][2]; 
        
        // Check for negative weight cycles
        if(distance[u] !=  100000000 && distance[u] + weight < distance[v]){
            return new int[] {-1}; // Return -1 for negative cycle
        }
    }
    return distance; // Return the final distances
}