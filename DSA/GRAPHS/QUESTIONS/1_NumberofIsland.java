class Result {
  static void BFS(int row , int column, boolean visited[][] , int m , int n) { // row,column represents source
     Queue<int[]> q = new LinkedList<>() ; // row , column pair
     q.add(new int[]{row,column}) ;
     visited[row][column] = true ; 
     while(!q.isEmpty()) {
         int[] node = q.poll() ;
         int i = node[0] ;
         int j = node[1] ;
         // visit the child neighbours 4 directions 
         if(i-1 >= 0 && !visited[i-1][j]) {
             q.add(new int[]{i-1,j});
             visited[i-1][j] = true ;
         }
         if(i+1 < m && !visited[i+1][j]){
             q.add(new int[]{i+1,j});
             visited[i+1][j] = true ;            
         }
         if(j-1 >= 0 && !visited[i][j-1]){
             q.add(new int[]{i,j-1});
             visited[i][j-1] = true ;             
         }
         if(j+1 < n && !visited[i][j+1]){
             q.add(new int[]{i,j+1});
             visited[i][j+1] = true ;             
         }
     }
  }
  static int countIslands(int mat[][], int m, int n){
      // INITILIZATION : 
      boolean [][] visited = new boolean[m][n] ;
      for(int i = 0 ; i < m ; i++) {
          for(int j = 0 ; j < n ; j++) {
              if(mat[i][j] == 0) {
                  visited[i][j] = true ; 
              }
              else{
                  visited[i][j] = false ; 
              }
          }
      }
      // LOOP :
      int counter = 0 ;
      for(int i = 0 ; i < m ; i++ ){
          for(int j = 0 ; j < n ; j++ ){
              if(!visited[i][j]){
                  BFS(i,j,visited,m,n) ;
                  counter++ ;
              }
          }
      }
      
      // RETURN 
      return counter ;
  }   
}