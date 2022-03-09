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
            if (numbers[high] > numbers[p])  //说明[p..high]区间是同一个区间，如果存在最小值的话，下标应该为p
                high = p;
            else if (numbers[p] > numbers[high])  //说明[low..p]和[p+1..high]是分别为两个区间，又因为numbers[p]对于numbers[high]，所以最小值只能是在p的右边
                low = p+1;
            else
                high -= 1;
        }

        return numbers[low];
    }
}
