class Solution {
    public void helper(int index , int k , List<Integer> current , List<List<Integer>> result,int[] nums) {
        if(current.size() == k) {
            result.add(new ArrayList<>(current)) ;
            return ; 
        }
        for(int i = index ; i < nums.length ; i++) {
            current.add(nums[i]) ;
            helper(i+1,k,current,result,nums) ;
            current.remove(current.size() - 1) ;
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>() ;
        List<Integer> current = new ArrayList<>() ; 
        int [] nums = new int[n]; 
        for(int i = 0 ; i < n ; i++) {
            nums[i] = i + 1 ; 
        } 
        helper(0,k,current,result,nums) ; 
        return result ; 

    }
}