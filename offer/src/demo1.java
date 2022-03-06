import java.util.HashSet;

/**
 * 数组中重复的数字
 */
public class demo1 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int num : nums){
            if (set.contains(num))
                return num;
            set.add(num);
        }

        return 0;
    }
}
