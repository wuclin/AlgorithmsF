/**
 * 旋转数组的最小数字target
 * 存在性质：最小值的左边元素都大于等于target，右边元素都小于等于target
 * 且最小值在两个子区间的分界，
 */
public class demo9 {
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high){
            int p = low + (high - low)/2;
            if (numbers[high] > numbers[p])
                high = p;
            else if (numbers[p] > numbers[high])
                low = p+1;
            else
                high -= 1;
        }

        return numbers[low];
    }
}
