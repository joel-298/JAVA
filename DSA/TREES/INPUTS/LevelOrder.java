// LEVEL ORDER INPUT AND LEVEL ORDER TRAVERSAL 
import java.util.LinkedList;
import java.util.Queue;
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
}

public class BinaryTree {

    // Preorder Traversal
    public static void PRE(TreeNode root) {
        if (root != null) {
            PRE(root.left);
            System.out.print(root.value + " ");
            PRE(root.right);
        }
    }

    // Level Order Traversal
    public static void LEVEL(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(temp.value + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    // Build Tree
    public static TreeNode BuildTree() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        } else {
            TreeNode root = new TreeNode(data);
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                TreeNode currentParent = q.poll();

                int leftData = sc.nextInt();
                if (leftData != -1) {
                    TreeNode leftChild = new TreeNode(leftData);
                    currentParent.left = leftChild;
                    q.add(leftChild);
                }

                int rightData = sc.nextInt();
                if (rightData != -1) {
                    TreeNode rightChild = new TreeNode(rightData);
                    currentParent.right = rightChild;
                    q.add(rightChild);
                }
            }
            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode root = BuildTree();
        
        // Preorder Traversal
        PRE(root);
        System.out.println();

        // Level Order Traversal
        LEVEL(root);
    }
}
