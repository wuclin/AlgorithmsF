/**
 * 重建二叉树
 * 通过前序和中序
 */
public class demo5 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if (preStart > preEnd)
            return null;

        int count = -1;
        for (int i = inStart; i <= inEnd; i++)
        {
            if (inorder[i] == preorder[preStart])
                count = i;
        }

        int left = count - inStart;
        TreeNode root = new TreeNode(preorder[preStart]);
        root.left = build(preorder, preStart+1, preStart+left,inorder,inStart,count-1);
        root.right = build(preorder,preStart+1+left, preEnd, inorder, count+1, inEnd);

        return root;
    }

}
