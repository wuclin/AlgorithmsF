public class demo6 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right){
        if (left == null && right == null)
            return true;
        else if (left == null && right != null)
            return false;
        else if(left != null && right == null)
            return false;
        else if(left.val != right.val)
            return false;

        boolean inside = isSymmetric(left.right, right.left);
        boolean outside = isSymmetric(left.left, right.right);
        return inside&&outside;

    }

}
