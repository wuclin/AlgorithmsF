public class demo9 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (root.left != null)
            return 1 + right;
        if (root.right != null)
            return 1 + left;
        return Math.min(left, right) + 1;

    }
}
