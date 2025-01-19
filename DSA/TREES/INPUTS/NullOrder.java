// NULL ORDER INPUT 
import java.util.*;

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

    // Convert Array to Tree
    public static TreeNode ArrToTree(List<String> arr) {
        if (arr.isEmpty() || arr.get(0).equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(arr.get(0)));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        for (int i = 1; i < arr.size(); i += 2) {
            TreeNode current = q.poll();
            if (!arr.get(i).equals("null")) {
                current.left = new TreeNode(Integer.parseInt(arr.get(i)));
                q.add(current.left);
            }
            if (i + 1 < arr.size() && !arr.get(i + 1).equals("null")) {
                current.right = new TreeNode(Integer.parseInt(arr.get(i + 1)));
                q.add(current.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<String> s = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            s.add(sc.next());
        }

        TreeNode root = ArrToTree(s);
        LEVEL(root);
    }
}
