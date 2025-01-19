class Solution {
    public void helper(int index , int [] nums , List<Integer> current , List<List<Integer>> result) {
        result.add(new ArrayList<>(current)) ; 

        for(int i = index ; i < nums.length ; i++) {
            if(i > index && nums[i] == nums[i-1]) {
                continue ; 
            }

            current.add(nums[i]) ;
            helper( i + 1 , nums , current , result) ;
            current.remove(current.size() - 1) ;

        } 

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ;
        List<Integer> current = new ArrayList<>() ;
        Arrays.sort(nums) ;
        helper(0,nums,current,result) ;
        return result ; 
    }   
}