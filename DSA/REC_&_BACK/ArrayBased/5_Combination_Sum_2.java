class Solution {
    public void helper(int index , int target , int[] nums , List<Integer> current , List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(current)) ;
        }

        for(int i = index ; i < nums.length ; i++) {
            if(i > index && nums[i] == nums[i-1]) {
                continue; 
            }
            // target deducting value 
            if(nums[i] > target) {
                return ; // prune this brance 
            }
            current.add(nums[i]) ;
            helper(i+1,target-nums[i],nums,current,result) ;
            current.remove(current.size()-1) ;
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates) ; 
        List<List<Integer>> result = new ArrayList<>() ;
        List<Integer> current = new ArrayList<>() ;
        helper(0,target,candidates,current,result) ;
        return result ; 
    }
}

// THIS CODE DOWN BELOW IS CORRECT BUT IT IS CAUSING TLE BECAUSE WE ARE ADDING THE SUM AGAIN AND AGGAIN FOR CURRENT
// SO FOR THIS PROBLEM WE ARE GOING TO UPDATE TARGET'S VALUE THROUGH RECURSION ONLY(DEDUCTING IT AGAIN AND AGAIN)   
//     public void helper(int index , int target , int[] nums , List<Integer> current , List<List<Integer>> result) {
//         int sum = 0 ; 
//         for(int i = 0 ; i < current.size() ; i++) {
//             sum += current.get(i) ;
//         }
//         if(sum == target) {
//             result.add(new ArrayList<>(current)) ;
//         }

//         for(int i = index ; i < nums.length ; i++) {
//             if(i > index && nums[i] == nums[i-1]) {
//                 continue; 
//             }
//             current.add(nums[i]) ;
//             helper(i+1,target,nums,current,result) ;
//             current.remove(current.size()-1) ;
//         }
//     }
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         Arrays.sort(candidates) ; 
//         List<List<Integer>> result = new ArrayList<>() ;
//         List<Integer> current = new ArrayList<>() ;
//         helper(0,target,candidates,current,result) ;
//         return result ; 
//     }