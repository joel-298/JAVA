// SHORTEST PATH IN BINARY MAZE : 
class Result {    
    static int shortestPath(int mat[][], int srcR, int srcC, int destR, int destC, int m, int n){
        // base case
        if(mat[srcR][srcC] == 0 || mat[destR][destC] == 0) {
            return -1 ; 
        }
        // initilization 
        boolean[][] visited = new boolean[m][n] ;
        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(mat[i][j] == 0){
                    visited[i][j] = true;   
                }
                else {
                    visited[i][j] = false ;
               }
            }
        }
        Queue<int[]> q = new LinkedList<>() ;
        q.add(new int[]{srcR,srcC,0}) ;
        visited[srcR][srcC] = true ; 
        // BFS LOOP 
        while(!q.isEmpty()){
            int [] node = q.poll() ;
            int row = node[0] ; 
            int column = node[1] ;
            int depth = node[2] ;
            if(row == destR && column == destC){
                return depth ; 
            }
            
            // loop on all the 4 directions 
            if(row-1 >= 0 && !visited[row-1][column]){
                visited[row-1][column] = true ;
                q.add(new int[]{row-1,column,depth+1}) ;
            }
            if(row+1 < m && !visited[row+1][column]){
                visited[row+1][column] = true ;
                q.add(new int[]{row+1,column,depth+1}) ;
            }
            if(column - 1 >= 0 && !visited[row][column-1]){
                visited[row][column-1] = true ;
                q.add(new int[]{row,column-1,depth+1}) ;
            }
            if(column+1 < n && !visited[row][column+1]){
                visited[row][column+1] = true ;
                q.add(new int[]{row,column+1,depth+1}) ;
            }
        }
        // return 
        return -1 ;
    }
}