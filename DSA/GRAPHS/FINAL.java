// SHORTEST PATH : node, vertex algorithm /   Queue<array[node,depth]> ,  normal bfs , if node == destination return depth , else add in queue increase current depth
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
// FIND PATH EXISTS :  HASHMAP(adjencyList , visited ) , QUEUE
class Graph {
public Map<Integer, List<Integer>> adj ;
    public Graph(int n){
        adj = new HashMap<>() ;
        for(int i = 0 ; i < n ; i++){
            adj.putIfAbsent(i,new ArrayList<>()) ;
        }
    }
    public void addEdge(int u , int v) {
        adj.get(u).add(v) ;
    }
    public boolean Path(int source, int destination) {
        Map<Integer,Boolean> visited = new HashMap<>() ; 
        for(int i:adj.keySet()){
            visited.put(i,false) ;
        }
        Queue<Integer> q = new LinkedList<>() ;
        q.add(source) ;
        visited.put(source,true) ;
        
        while(!q.isEmpty()) {
            int node = q.poll() ;
            if(node == destination){
                return true ;
            }
   
            for(int i:adj.get(node)){
                if(!visited.get(i)){
                    q.add(i) ;
                    visited.put(i,true ) ;
                }
            }   
          }
        return false ; 
    }
}
// DFS : HASHMAP(adjencyList , visited )
void DFSUtil(int source, Map<Integer,Boolean> visited , List<Integer> result) 
{
    visited.put(source,true) ;
    result.add(source) ;
    for(int i:adjVertices.get(source)){
        if(!visited.get(i)) {
            DFSUtil(i,visited,result) ;
        }
    }
} 
void DFS(int source) 
{ 
    // initilization
    Map<Integer,Boolean> visited = new HashMap<>() ;
    List<Integer> result = new ArrayList<>() ;
    for(int i:adjVertices.keySet()) {
        visited.put(i,false) ;
    }
    // algo 
    DFSUtil(source,visited,result) ;
    // printing 
    for(int i = 0 ; i < result.size() ; i++){
        if(i != result.size() -1 ){
            System.out.print(result.get(i)+" ") ;
        }
        else{
            System.out.print(result.get(i)) ;
        }
    }
} 
// BFS :  HASHMAP(adjencyList , visited ) , QUEUE
void BFS(int source) 
{ 
    Map<Integer,Boolean> visited = new HashMap<>() ; 
    for(int i:adjVertices.keySet()) {              // initilizaion og visited map
        visited.put(i,false) ;
    }
    Queue<Integer> q = new LinkedList<>() ;  // queue initilization
    q.add(source) ; 
    visited.put(source,true) ;
    List<Integer> result = new ArrayList<>() ; // result vector initilization
    result.add(source) ;
    while(!q.isEmpty()) { // ALGO 
        int node = q.poll() ; 
        for(int it : adjVertices.get(node)) {
            if(!visited.get(it)) {
                q.add(it) ;
                visited.put(it,true) ;
                result.add(it) ;
            }
        }
    }
    for(int i = 0 ; i < result.size() ; i++) {  // Printing
        if(i != result.size() - 1){
            System.out.print(result.get(i)+" "); 
        }
        else{
            System.out.print(result.get(i)) ;
        }
    }
} 
// CYC UNDIRECTED DFS : HASHMAP(adjencyList , visited )
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
// CYC DIRECTED DFS : HASHMAP(adjencyList , visited , df_visited)
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
// TOPOLOGICAL DFS : HASHMAP(visited) , STACK() , ARRAYLIST(adjencyList)
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
    ArrayList<Integer> result = new ArrayList<>() ; // PRINTING
    while(!s.isEmpty()) {
        result.add(s.pop()) ;
    }
    return result ; // RETURNING STATEMENT  
}
// BELLMAN : ARRAY(distance)
static int[] bellmanFord(int n , int[][] edges, int src) {
    int[] distance = new int[n]; // STEP 1 INITIALIZATION : 
    for(int i = 0; i < n; i++) {
        distance[i] = 100000000; // consider this as a max value
    }
    distance[src] = 0; 
    for(int i = 0; i < n - 1; i++) {     // STEP 2 LOOP TILL N-1 
        for(int j = 0; j < edges.length; j++) {
            int u = edges[j][0]; 
            int v = edges[j][1];
            int weight = edges[j][2]; 
            if(distance[u] !=  100000000 &&  distance[v] > distance[u] + weight){  // Similar to dijkstras
                distance[v] = distance[u] + weight; 
            }
        }
    }
    for(int j = 0; j < edges.length; j++) {     // STEP 3 CHECK FOR CYCLES (Negative weight cycles detection)
        int u = edges[j][0]; 
        int v = edges[j][1];
        int weight = edges[j][2]; 
        if(distance[u] !=  100000000 && distance[u] + weight < distance[v]){
            return new int[] {-1}; // Return -1 for negative cycle
        }
    }
    return distance; // Return the final distances
}
// DIJKSTRAS ARRAY(distance) , SET(pair<distance,node>)/PRIORITYQUEUE(pair(distance,node));
ArrayList<Integer> dijkstra(ArrayList<ArrayList<Pair>> adj, int src) {
    ArrayList<Integer> distance = new ArrayList<>();
    for(int i=0;i<adj.size();i++){
        distance.add(Integer.MAX_VALUE);
    }
    PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.first-b.first); // SET/PRIORITY_QUEUE -> min_heap based on 1st element of pair i.e distance
    distance.set(src,0);
    pq.offer(new Pair(0,src));
    while(!pq.isEmpty()){                                      
        Pair current = pq.poll();                                    
        int dist = current.first;
        int u = current.second;
        for(Pair i: adj.get(u)){
            int v = i.first;                
            int weight = i.second;    
            if(distance.get(u) != Integer.MAX_VALUE && distance.get(v) > dist + weight ){  // Similar to bellman
                distance.set(v, dist + weight);                                 // update distance
                pq.offer(new Pair(distance.get(v),v));                          // add in priority queue
            }
        }
    }
    return distance;
}
// PRIMS : ARRAY(nodes , MST_visited , parent) : 
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
// DP : LCS 
class Result
{
  static int longestCommonSubsequence(String str1, String str2){
      int m = str1.length();
      int n = str2.length();
      int[][] dp = new int[m+1][n+1];
      for(int i=1;i<=m;i++){
          for(int j=1;j<=n;j++){
              if(str1.charAt(i-1) == str2.charAt(j-1)){
                  dp[i][j] = dp[i-1][j-1]+1;
              }
              else{
                  dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
              }
          }
      }
      return dp[m][n];
  }
}
// DP : SUBSET PROBLEM
class Result
 {
  static int subsetSum(int a[], int n, int sum){
    if(sum == 0) return 1;
      if(n == 0) return 0;
      if(a[n-1] > sum){
          return subsetSum(a,n-1,sum);
      }
      int result = 0;
      if(subsetSum(a,n-1,sum) == 1 || subsetSum(a,n-1,sum-a[n-1]) ==1){
          result = 1;
      }
      return result;
  }
 }
// DP : MATRIX CHAIN MULTIPLICATION PROBLEM
class Result
{
  static int matrixChainMultiplication(int p[], int n){
    // INITILIZATION OF DP ARRAY : 
      Integer[][] dp = new Integer[n+1][n+1];
      for(int i =0;i<=n;i++){
          for(int j=0;j<=n;j++){
              if(i!=j){
                  dp[i][j]=-1;
              }
              if(i==j){
                  dp[i][j]=0;
              }
          }
      }
      return ans(p,1,n,dp);
  }
    static int ans(int p[],int i,int j,Integer[][] dp){
        // base case
        if(i==j){
            return 0;
        }
        // dp base case
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        // recursive case
        int r =Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int a = ans(p,i,k,dp);
            int b = ans(p,k+1,j,dp);
            int c = p[i-1]*p[k]*p[j];
            r=Math.min(r,a+b+c);
        }
        // storing and returning 
        dp[i][j]=r;
        return dp[i][j];
    }
}
// DP : KNAP SACK 
class Result
{
  static int zeroOneKnapsack(int val[], int weight[], int n, int capacity){
    int[][] dp = new int[n+1][capacity+1];
      
      for(int i=1;i<=n;i++){
          for(int j=1;j<=capacity;j++){
              if(weight[i-1] <= j){
                  dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+val[i-1]);
              }
              else{
                  dp[i][j] = dp[i-1][j];
              }
          }
      }
      return dp[n][capacity];
  }
}