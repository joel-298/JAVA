class Solution {
    public void Helper(int[] nums , int index , List<Integer> current , List<List<Integer>> result) {
        // base case
        result.add(new ArrayList<>(current)) ; 
        // recursive case 
        for(int i = index ; i < nums.length ; i++) {
            current.add(nums[i]) ;
            Helper(nums,i+1,current,result) ; 
            current.remove(current.size() - 1); 
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ; 
        List<Integer> current = new ArrayList<>() ;
        Helper(nums,0,current,result) ; 
        return result ; 
    }
}