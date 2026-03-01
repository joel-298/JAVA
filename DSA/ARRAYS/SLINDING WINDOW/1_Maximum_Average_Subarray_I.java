class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // APPROACH 1 : 
        double result = -Double.MAX_VALUE ;
        int left = 0 ; 
        double sum = 0 ; 
        double K = k ; 
        for(int i = 0 ; i <= nums.length ; i++) {
            if(k == 0) {
                if(sum/K >= result) {
                    result = sum/K ; 
                }
                sum -= nums[left] ; 
                if(i == nums.length) {
                    continue ; 
                }
                sum += nums[i] ; 
                left++ ;
                continue ; 
            }
            sum += nums[i] ; 
            k-- ;
        }

        return result ; 

        // APPROACH 2 : 
        double sum = 0 ; 
        for(int i = 0 ; i < k ; i++) {
            sum += nums[i] ; 
        }     
        double window = sum ; 
        for(int i = k ; i < nums.length ; i++) {
            sum = sum + nums[i] - nums[i-k] ; 
            window = Math.max(window,sum) ; 
        }  
        return window/k ; 
    }
}