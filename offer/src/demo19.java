/**
 * 调整数组使奇数在前半部分
 *  & 1 如果不等于0 则为奇数
 */
public class demo19 {
    public int[] exchange(int[] nums) {
        int i = 0, j = 0;
        while(j < nums.length){
            if ((nums[j] & 1) != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }
}
