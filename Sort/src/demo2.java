public class demo2 {
    private static int[] aux;

    public void sort(int[] nums){
        aux = new int[nums.length];
        sort(nums, 0, nums.length - 1);
    }

    public void sort(int[] nums, int lo, int hi){
        if (lo >= hi)
            return;
        int mid = lo + (hi - lo)/2;
        sort(nums, lo, mid);
        sort(nums, mid + 1, hi);
        merge(nums, lo, mid, hi);
    }

    public void merge(int[] nums, int lo, int mid, int hi){
        int i = lo, j = mid + 1;

        for (int k = lo; k < hi; k++)
            aux[k] = nums[k];

        for (int k = lo; k < hi; k++){
            if (i > mid) nums[k] = aux[j++];
            else if (j > hi) nums[k] = aux[i++];
            else if (aux[i] > aux[j]) nums[k] = aux[j++];
            else nums[k] = aux[i++];
        }
    }
}
