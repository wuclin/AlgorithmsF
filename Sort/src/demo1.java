/**
 * 快排
 */
public class demo1 {

    public void quick(int[] nums){
        quick(nums, 0, nums.length - 1);
    }

    public void quick(int[] nums, int lo, int hi){
        if (lo >= hi)
            return;

        int j = paration(nums, lo, hi);
        quick(nums, lo, j - 1);
        quick(nums, j + 1, hi);
    }

    public int paration(int[] nums, int lo, int hi){
        int i = lo, j = hi + 1;
        int temp = nums[lo];

        while(true){
            while(nums[++i] < temp) if (i == hi) break;
            while(nums[--j] > temp) if (j == lo) break;
            if (i >= j) break;
            exch(nums, i, j);
        }

        exch(nums, lo, j);
        return j;
    }
}
