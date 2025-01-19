// CREATE BALANCED BST FROM A SORTED ARRAY WITH THE MEDTOD OF SPILITING IT IN HALF .......

class TreeNode {
    int value;
    TreeNode left, right;

    // Constructor
    TreeNode(int data) {
        this.value = data;
        left = right = null;
    }
}

public class BalancedBST {

    // Create a balanced BST from a sorted array
    public TreeNode create(int[] arr, int si, int ei) {
        // Base case
        if (si > ei) {
            return null;
        }
        
        // Find the middle index
        int mid = (si + ei) / 2;
        
        // Create the node with the middle element
        TreeNode node = new TreeNode(arr[mid]);
        
        // Recursively create left and right subtrees
        node.left = create(arr, si, mid - 1);
        node.right = create(arr, mid + 1, ei);
        
        return node;
    }

    public static void main(String[] args) {
        BalancedBST bst = new BalancedBST();
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example sorted array
        TreeNode root = bst.create(arr, 0, arr.length - 1);

        // You can add a method to print or validate the BST structure here
    }
}
