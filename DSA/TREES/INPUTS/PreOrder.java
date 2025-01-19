// PRE-ODER INPUT : 
import java.util.Scanner;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    // Constructor
    TreeNode(int data) {
        value = data;
        left = right = null;
    }
};

public class BinaryTree {

    // Build Tree Method
    public static TreeNode buildTree(Scanner sc) {
        int data = sc.nextInt();

        if (data == -1) return null;

        TreeNode root = new TreeNode(data);
        root.left = buildTree(sc);
        root.right = buildTree(sc);
        return root;
    }

    // Preorder Traversal Method
    public static void PreorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + "->");
            PreorderTraversal(root.left);
            PreorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Building the Tree
        TreeNode root = buildTree(sc);

        // Preorder Traversal
        System.out.println("Preorder Traversal of the Tree:");
        PreorderTraversal(root);
        System.out.println();
    }
}
