public class demo18 {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode build(int[] preorder, int preStart, int preEnd, int[] postorder, int postStart, int postEnd){
        if (preStart > preEnd)
            return null;
        if (preorder[preStart] == preorder[preEnd])
            return new TreeNode(preorder[preStart]);

        int leftIndex = 0;
        for (int i = postStart; i <= postEnd; i++){
            if (postorder[i] == preorder[preStart+1]){
                leftIndex = i;
                break;
            }
        }

        int leftSize = leftIndex - postStart + 1;
        TreeNode root = new TreeNode(preorder[preStart]);
        root.left = build(preorder, preStart+1, preStart+leftSize, postorder, postStart, leftIndex);
        root.right = build(preorder, preStart+leftSize+1, preEnd, postorder, leftIndex+1, postEnd);
        //这里最后使用的是postEnd不是postEnd-1
        return root;

    }
}
