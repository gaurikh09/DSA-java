// Welcome to CodeCollab!

public class Main {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Calculate height and diameter
    static int diameter = 0;

    public static int height(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Calculate left subtree height
        int leftHeight = height(root.left);

        // Calculate right subtree height
        int rightHeight = height(root.right);

        // Update diameter
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        height(root);

        System.out.println("Diameter of Tree: " + diameter);
    }
}
