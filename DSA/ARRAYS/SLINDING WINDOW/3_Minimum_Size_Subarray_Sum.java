// Minimum Size SubArray Sum  

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        int right = 0;
        int windowSize = 0 ; 

        while(right < n){
            if(sum < target){
                sum += nums[right];
                right++;
                windowSize++ ; 
            }

            while(sum >= target){
                result = Math.min(result,windowSize);
                sum -= nums[left];
                left++;
                windowSize--;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result ;
    }
}