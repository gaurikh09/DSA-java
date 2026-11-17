
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Main {
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        System.out.print("Test Case 1: ");
        inorder(root1);
        Node root2 = new Node(10);
        root2.left = new Node(20);
        root2.right = new Node(30);
        System.out.print("\nTest Case 2: ");
        inorder(root2);
        Node root3 = new Node(5);
        System.out.print("\nTest Case 3: ");
        inorder(root3);
    }
}
