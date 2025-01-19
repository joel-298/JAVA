class Solution {
    public void helper(int index , int target , int k , int [] nums , List<Integer> current , List<List<Integer>> result ) {
        if(current.size() == k) {
            int sum = 0 ; 
            for(int i = 0 ; i < k ; i++) {
                sum += current.get(i) ;
            }
            if(sum == target) {
                result.add(new ArrayList<>(current)) ;
            }
            return  ;
        }
        for(int i = index ; i < nums.length ; i++) {
            current.add(nums[i]) ;
            helper(i+1,target,k,nums,current,result) ;
            current.remove(current.size() -1) ;
        } 
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] nums = new int[9] ;
        for(int i = 0 ; i < 9 ; i++) {
            nums[i] = i + 1 ; 
        }
        List<List<Integer>> result = new ArrayList<>() ;
        List<Integer> current = new ArrayList<>() ; 
        helper(0,n,k,nums,current,result) ; 
        return result ; 
    }
}