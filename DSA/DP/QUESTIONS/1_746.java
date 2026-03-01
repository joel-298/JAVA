// MINIMUM COST CLIMBING STAIRS
class Solution {
public int [] dp = new int[1001] ;
    public int recursive(int index , int[] cost) {
        // base case (out of bonds)
        if(index >= cost.length) {
            return 0 ; 
        }
        // dp case 
        if(dp[index] != 0) {
            return dp[index] ;
        }
        // recursive case
        int one = recursive(index+1,cost) + cost[index] ;
        int two = recursive(index+2,cost) + cost[index] ;
        dp[index] = Math.min(one,two) ;
        // return
        return dp[index] ;
    }
    public int minCostClimbingStairs(int[] cost) {
        boolean x = true ; 
        for(int i = 0 ; i < cost.length ; i++) {
            if(cost[i] != 0) {
                x = false ;
                break ;
            }
        }
        if(!x) {
            return Math.min(recursive(0,cost),recursive(1,cost)) ;
        }
        else{
            return 0 ;
        }
    }
}