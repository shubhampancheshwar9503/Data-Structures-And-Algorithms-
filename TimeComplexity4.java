public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {

        this.value = value;
    }

    public static int sum(TreeNode node) {

        if (node == null) {
            return 0;
        }

        return sum(node.left) + node.value + sum(node.right);
    }

    public static void main(String[] args) {

        // Example usage:
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        int totalSum = sum(root);
        System.out.println("Total sum of tree nodes : " + totalSum);
    }

}
