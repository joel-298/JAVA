// PRE ORDER AND INORDER : 
class Solution {
    public TreeNode HELPER(int[] preorder, int[] inorder , Map<Integer,Integer> inorderMap , int Index , int s , int e ) {
        // set the root node
        TreeNode root = new TreeNode(preorder[Index]) ; 
        // set mid 
        int mid = inorderMap.get(preorder[Index]) ; // get index of this root from inorder array 
        // traversing 
        if(mid > s) { // go to left side of inorder i.e 1 > 0 (Index)
            root.left = HELPER(preorder,inorder,inorderMap,Index+1,s,mid-1) ; 
        }
        if(mid < e) { // go to right size of inorder 1 < 2 i.e node present in right side of ending (Index)
            root.right = HELPER(preorder,inorder,inorderMap,Index+mid+1-s,mid+1,e) ; 
        }
        return root ; 
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // base case 
        if(inorder.length == 0) {
            return null ;
        }
        // create a hashmap 
        Map<Integer,Integer> inorderMap = new HashMap<>() ;
        for(int i = 0 ; i < inorder.length ; i++) {
            inorderMap.putIfAbsent(inorder[i],i) ;
        }
        // call the helper function 
        int e = inorder.length - 1; 
        int Index = 0 , s = 0;
        TreeNode root = HELPER( preorder , inorder , inorderMap , Index , s , e) ;
        return root ; 
    }
}
