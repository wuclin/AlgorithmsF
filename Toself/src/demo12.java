public class demo12 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == q || root == p)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null && right == null)
            return null;
        else if(left == null && right != null)
            return right;
        else if(left != null && right == null)
            return left;
        else
            return root;
    }
}
