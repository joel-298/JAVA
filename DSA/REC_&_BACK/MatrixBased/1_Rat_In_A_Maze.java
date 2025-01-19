class Solution {
    
    public void helper(int i , int j , StringBuilder current, ArrayList<String> result , ArrayList<ArrayList<Integer>> mat , int n, int m , boolean [][] visited){
        if(i == n && j == m) {
            result.add(current.toString()) ; 
            return ;
        }
        if(i < 0 || j < 0 || i > n || j > m || visited[i][j]) {
            return ; 
        }
        
        visited[i][j] = true ; 
        
        // traveral of all 4 directions 
        if(i+1 <= n && mat.get(i+1).get(j) != 0) { // down
            current.append("D") ;
            helper(i+1,j,current,result,mat,n,m,visited) ; 
            current.deleteCharAt(current.length() - 1);
        }
        if(j+1 <= m && mat.get(i).get(j+1) != 0) { // right
            current.append("R") ;
            helper(i,j+1,current,result,mat,n,m,visited) ; 
            current.deleteCharAt(current.length() - 1);            
        }
        if(j-1 >= 0 && mat.get(i).get(j-1) != 0){ // left 
            current.append("L") ;
            helper(i,j-1,current,result,mat,n,m,visited) ; 
            current.deleteCharAt(current.length() - 1);            
        }
        if(i-1 >= 0 && mat.get(i-1).get(j) != 0 ){ // up
            current.append("U") ;
            helper(i-1,j,current,result,mat,n,m,visited) ; 
            current.deleteCharAt(current.length() - 1);                
        }
        
        visited[i][j] = false ; 
        
    }
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        int n = mat.size() - 1; 
        int m = mat.get(0).size() - 1; 
        ArrayList<String> result = new ArrayList<>() ; 
        StringBuilder current = new StringBuilder("") ;
        boolean [][] visited = new boolean[n+1][m+1] ;
        
        helper(0,0,current,result,mat,n,m,visited) ; 
        Collections.sort(result) ;
        return result ; 
    }
}



// WHY ARE WE USING VISITED ? 
// 🛑 Where Does the Infinite Loop Happen Then?
// It happens in a different recursive path.
// When (2,1) explores other directions (Right, Left, Up) and eventually comes back to (2,1) via another path, 
// the Down (D) direction will execute again because (3,1) is still considered unvisited.