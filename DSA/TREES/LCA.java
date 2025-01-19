// IN JAVA 
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        // If the current node is one of the target nodes (p or q)
        if (root == p || root == q) {
            return root;
        }

        // Recurse on left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right are non-null, this is the LCA
        if (left != null && right != null) {
            return root;
        }

        if (left != null) {
            return left;  // If left is not null, return the left node.
        } else {
            return right;  // If left is null, return the right node.
        }
    }
}


// IN CPP 
class Solution {
public:
    bool Tree(TreeNode* root, TreeNode* p, TreeNode* q, TreeNode* &x) {
        if (!root) {
            return false;
        }
        bool foundCurrent = (root == p || root == q);
        
        bool left = Tree(root->left, p, q, x);
        bool right = Tree(root->right, p, q, x);
        
        if (left && right) {
            x = root;
        }

        // If the current node matches either p or q, and one of its subtrees contains the other node,
        // the current node is the LCA
        if (foundCurrent && (left || right)) {
            x = root;
        }

        // Return true if the current node is p, q, or if one of the subtrees contains p or q
        return foundCurrent || left || right;
    }
    
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        TreeNode* x = nullptr;
        Tree(root, p, q, x);
        return x;
    }
};