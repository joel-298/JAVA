// Find the node with the minimum value in a given subtree
public Node minval(Node root) {
    Node current = root;
    // Loop down to find the leftmost leaf
    while (current != null && current.left != null) {
        current = current.left;
    }
    return current;
}

// Deletion function
public Node deletion(Node root, int n) {
    // Base case
    if (root == null) {
        return root;
    }

    if (root.data == n) {
        // Case 0: Node with no child
        if (root.left == null && root.right == null) {
            return null;
        }
        // Case 1: Node with only one child (left)
        if (root.left != null && root.right == null) {
            return root.left;
        }
        // Case 1: Node with only one child (right)
        if (root.right != null && root.left == null) {
            return root.right;
        }
        // Case 2: Node with two children
        if (root.left != null && root.right != null) {
            //there are two ways now either left me se max value nikal lo ya right me se min
            // RIGHT MINIMUM
            int mini = minval(root.right).data;
            root.data = mini;
            root.right = deletion(root.right, mini);
            return root;
        }
    }

    // Traverse the tree
    else if (n < root.data) {
        root.left = deletion(root.left, n);
        return root;
    }
    else if (n > root.data) {
        root.right = deletion(root.right, n);
        return root;
    }

    // Return root when root.data != n
    return root;
}
