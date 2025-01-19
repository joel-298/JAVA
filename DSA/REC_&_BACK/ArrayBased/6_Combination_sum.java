class Solution {
    public void helper(int index, int target , int[] nums , List<Integer> current , List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(current)) ;
            return ; 
        }
        for(int i = index ; i < nums.length ;  i++ ) {
            if(nums[i] > target) {
                continue ;
            }
            current.add(nums[i]) ;
            helper(i,target-nums[i],nums,current,result) ;
            current.remove(current.size() - 1) ;
        }  
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> current = new ArrayList<>(); 
        helper(0,target,candidates,current,result) ;
        return result ; 
    }
}