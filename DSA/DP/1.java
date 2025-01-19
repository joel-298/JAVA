// CLIMBING STAIRS TEST PAD
import java.util.* ;
class Result
{
  public static int [] dp ;
  static int totalWaysToDistance(int d, int k){
      // create dp array 
      if(dp == null) {
          dp = new int[d+1]  ;
      }
      // base case
      if(d < 0){
          return 0 ;
      }
      if(d == 1 || d == 0){
          return 1 ;
      }
      // dp base case 
      if(dp[d] != 0){
          return dp[d] ;
      }
      // recursive case
      int sum = 0 ;
      for(int i = 1 ; i <= k ; i++) {
          int a = totalWaysToDistance(d-i,k) ;
          sum +=a ;
      }
      // return and dp storing
      dp[d] = sum ;
      return dp[d];
  }
}