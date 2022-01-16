public class demo5 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
