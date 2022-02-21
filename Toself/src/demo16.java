public class demo16 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if (preStart > preEnd)
            return null;

        int index = -1;
        for (int i = inStart; i <= inEnd; i++){
            if (inorder[i] == preorder[preStart]){
                index = i;
            }
        }

        int leftSize = index - inStart;

        TreeNode root = new TreeNode(preorder[preStart]);
        root.left = build(preorder,preStart+1,preStart+leftSize,inorder,inStart,index-1);
        root.right = build(preorder,preStart+leftSize+1,preEnd,inorder,index+1,inEnd);

        return root;

    }
}
