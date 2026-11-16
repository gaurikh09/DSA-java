public class Main {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return lc + rc + 1;
    }
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Total Nodes: " + countNodes(root));
    }
}
