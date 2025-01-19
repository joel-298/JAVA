// // -1 type of input in BST 


// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// class TreeNode {
//     int value;
//     TreeNode left;
//     TreeNode right;

//     // Constructor
//     TreeNode(int data) {
//         value = data;
//         left = right = null;
//     }
// }

// public class BinaryTree {

//     // Build Tree Method
//     public static TreeNode BuildTree(TreeNode root, int data) {
//         if (root == null) {
//             root = new TreeNode(data);
//             return root;
//         } else {
//             if (data > root.value) {
//                 root.right = BuildTree(root.right, data);
//             } else {
//                 root.left = BuildTree(root.left, data);
//             }
//             return root;
//         }
//     }

//     // Insert Method
//     public static void INSERT(TreeNode[] root) {
//         Scanner sc = new Scanner(System.in);
//         int data;

//         data = sc.nextInt();
//         while (data != -1) {
//             root[0] = BuildTree(root[0], data);
//             data = sc.nextInt();
//         }
//     }

//     // Level Order Traversal
//     public static void LEVEL(TreeNode root) {
//         Queue<TreeNode> Q = new LinkedList<>();
//         Q.add(root);
//         Q.add(null);

//         while (!Q.isEmpty()) {
//             TreeNode temp = Q.poll();
//             if (temp == null) { // separator
//                 System.out.println();
//                 if (!Q.isEmpty()) {
//                     Q.add(null);
//                 }
//             } else {
//                 System.out.print(temp.value + " ");
//                 if (temp.left != null) { // left is present
//                     Q.add(temp.left);
//                 }
//                 if (temp.right != null) { // right is present
//                     Q.add(temp.right);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         TreeNode[] root = {null}; // Using an array to allow modification in INSERT method
//         INSERT(root);
//         LEVEL(root[0]); // LEVEL ORDER TRAVERSAL
//     }
// }




// // OUTPUT : 
// // 100 50 25 70 60 110 120 115 -1
// // 100 
// // 50 110 
// // 25 70 120 
// // 60 115 

// // === Code Execution Successful ===


// SIMPLE APPROACH INSTEAD OF CREATING ROOT ARRAY : LIKE WE DO IN REST OF THE TREES : OF PREORDER , LEVEL ORDER , NULL  
import java.util.*;

class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        data = value;
        left = right = null;
    }
    // BUILDING TREE
    public TreeNode HELPER(int data , TreeNode root) {
        if(root == null || root.data == -1) {
            root = new TreeNode(data) ;
            return root;
        } 
        if (data > root.data) { // go right
            root.right = HELPER(data,root.right) ;
        }
        else{ // go left
            root.left = HELPER(data,root.left) ;
        }
        return root ; 
        
    }
    public TreeNode BuildTree(Scanner sc) {
        int data = sc.nextInt() ; 
        TreeNode root = new TreeNode(-1);  // initialize
        while(data != -1) {
            root = HELPER(data,root) ;
            data = sc.nextInt() ;
        }
        return root ; 
        
    }
    // DISPLAY 
    public void DISPLAY(TreeNode root) {
        if(root == null) {
            System.out.print("-1") ;
        }
        Queue<TreeNode> q = new LinkedList<>() ;
        q.add(root) ;
        q.add(null) ;
        while(!q.isEmpty()) {
            TreeNode current = q.poll() ;
            if(current == null) {
                System.out.println();
                if(!q.isEmpty()) {
                    q.add(null) ;
                }
            }
            else{
                System.out.print(current.data+" ");
                if(current.left != null) {
                    q.add(current.left) ;
                }
                if(current.right != null) {
                    q.add(current.right) ;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-1) ; // initialized 
        Scanner sc = new Scanner(System.in);
        root = root.BuildTree(sc) ; // will receive that will reqrite the value of -1 
        root.DISPLAY(root);
    }
}
