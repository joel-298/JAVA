class Solution {
    public boolean DFS(TreeNode root, long left, long right) {
        if (root == null) {
            return true;
        }
        if (root.val > left && root.val < right) {
            // traversal
            boolean LEFT = DFS(root.left, left, root.val);
            boolean RIGHT = DFS(root.right, root.val, right);
            
            return LEFT && RIGHT;
        } else {
            return false;
        }
    }

    public boolean isValidBST(TreeNode root) {
        long left = Long.MIN_VALUE;
        long right = Long.MAX_VALUE;
        return DFS(root, left, right);
    }
}