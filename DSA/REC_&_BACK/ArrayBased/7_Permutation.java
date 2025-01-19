// PERMUTATION  : SUBSET CODE , ALSO CONDITION OF CONTAINS IN CURRENT 

class Solution {
    public void helper(int [] nums , List<Integer> current , List<List<Integer>> result) {
        if(current.size() == nums.length) {
            result.add(new ArrayList<>(current)) ;
            return ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(current.contains(nums[i])) {
                continue ; 
            }
            current.add(nums[i]) ;
            helper(nums,current,result) ; 
            current.remove(current.size() - 1) ;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ; 
        List<Integer> current = new ArrayList<>() ;
        helper(nums,current,result) ; 
        return result ; 
    }
}

// IF DOUBT DRY RUN IT : notice the for loop at line 7 and contains condition at 8 and try to visualize it ! 
