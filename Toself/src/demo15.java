public class demo15 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int lo, int hi){
        if (lo > hi)
            return null;

        int maxValue = Integer.MIN_VALUE;
        int index = -1;
        for (int i = lo; i <= hi; i++){
            if (nums[i] > maxValue)
            {
                maxValue = nums[i];
                index = i;
            }
        }

        TreeNode root = new TreeNode(maxValue);
        root.left = build(nums, lo, index - 1);
        root.right = build(nums ,index + 1, hi);
        return root;
    }
}
