public class demo17 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        if (inStart > inEnd)
            return null;

        int index = 0;
        for (int i = inStart; i <= inEnd; i++){
            if (inorder[i] == postorder[postEnd])
            {
                index = i;
                break;
            }
        }

        int leftSize = index - inStart;

        TreeNode root = new TreeNode(postorder[postEnd]);
        root.left = build(inorder,inStart,index-1,postorder,postStart,postStart+leftSize-1);
        root.right =build(inorder,index+1,inEnd,postorder,postStart+leftSize,postEnd-1) ;
        return root;

    }
}
