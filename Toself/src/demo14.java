public class demo14 {
    public void flatten(TreeNode root) {
        if (root == null)
            return;

        flatten(root.left);
        flatten(root.right);
        //保存原来的左右子树
        TreeNode left = root.left;
        TreeNode right = root.right;
        //左子树为空，左子树插到右子树的位置
        root.left = null;
        root.right = left;
        //遍历到当前树的右子树的最右节点，然后把左子树插在右子树的右节点
        TreeNode p = root;
        while(p.right != null){
            p = p.right;
        }
        p.right = right;
    }
}
