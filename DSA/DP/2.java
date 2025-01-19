// MINIMUM COST PATH TO THE LAST ELEMENT OF MATRIX  : TESTPAD
class Result
{
    public static int[][] dp;
    public static int recursive(int[][] cost, int m , int n){
        // Base case: If out of bounds, return a large value
        if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }
        // Base case: If at the source, return the cost at (0,0)
        if (m == 0 && n == 0) {
            return cost[0][0];
        }
        // If already computed, return the stored value
        if (dp[m][n] != 0) {
            return dp[m][n];
        }
        // Recursive case: Calculate the minimum cost from three directions
        int down = recursive(cost, m - 1, n);      // Downward
        int right = recursive(cost, m, n - 1);     // Right
        int diagonal = recursive(cost, m - 1, n - 1); // Diagonal
        // Add the cost of the current cell to the minimum of the three paths
        int minCost = cost[m][n] + Math.min(down, Math.min(right, diagonal));
        // Store the result and return it
        dp[m][n] = minCost;
        return dp[m][n];
    }
    static int minCostPath(int[][] cost, int m, int n) {
        // Initialize dp array
        if (dp == null) {
            dp = new int[m][n];
        }
        return recursive(cost,m-1,n-1) ;
    }
}