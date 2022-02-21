import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 */
public class demo1 {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
       LinkedList<Integer> trace = new LinkedList<>();
       backtrace(nums, trace);
       return res;
    }

    public void backtrace(int[] nums, LinkedList trace){
        if (trace.size() == nums.length){
            res.add(new LinkedList<>(trace));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (trace.contains(nums[i]))
                continue;

            trace.add(nums[i]);
            backtrace(nums, trace);
            trace.removeLast();
        }
    }

}
