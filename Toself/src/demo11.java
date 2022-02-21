public class demo11 {
    int res = Integer.MAX_VALUE;
    TreeNode pre;
    public int getMinimumDifference(TreeNode root) {
        if (root == null)
            return 0;
        traversal(root);
        return res;
    }

    public void traversal(TreeNode root){
        if (root == null) return;
        traversal(root.left);

        if (pre != null)
            res = Math.min(res, Math.abs(root.val - pre.val));
        pre = root;

        traversal(root.right);
    }
}
