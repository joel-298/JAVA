import java.util.LinkedList;
import java.util.Queue;

 class Result {
  static Node buildSearchTree(int t[], int n) {
    if (n == 0) {
      return null;
    }
    Node root = new Node(t[0]); // Initialize the root with the first element
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    int i = 1; // Index for the next element in the array
    while (i < n) {
      Node current = queue.poll();
      // Insert the left child if there is any element left
      if (i < n && t[i] < current.data) {
        current.leftChild = new Node(t[i++]);
        queue.add(current.leftChild);
      }
      // Insert the right child if there is any element left
      if (i < n && t[i] > current.data) {
        current.rightChild = new Node(t[i++]);
        queue.add(current.rightChild);
      }
    }
    return root;
  }
}