// POST ORDER AND INORDER : 
class Solution {
    public TreeNode HELPER(int[] postorder, int [] inorder , Map<Integer,Integer> inorderMap , int Index , int s , int e) {
        TreeNode root = new TreeNode(postorder[Index]) ; 
        int mid = inorderMap.get(postorder[Index]) ;
        if(mid > s) {
            root.left = HELPER(postorder,inorder,inorderMap,Index - (e - mid + 1),s,mid-1); 
        }
        if(mid < e) {
            root.right = HELPER(postorder,inorder,inorderMap,Index-1,mid+1,e) ;
        }
        return root ;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0) {
            return null ; 
        }
        int Index = postorder.length - 1 , s = 0 , e = inorder.length -1 ;
        Map<Integer,Integer> inorderMap = new HashMap<>() ;
        for(int i = 0 ; i < e+1 ; i++) {
            inorderMap.putIfAbsent(inorder[i], i) ;
        }
        return HELPER(postorder,inorder,inorderMap,Index,s,e) ;
    }
}