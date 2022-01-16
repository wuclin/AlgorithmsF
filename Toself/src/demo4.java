import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class demo4 {
    public List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int len = queue.size();

            while (len > 0){
                TreeNode temp = queue.poll();
                list.add(temp.val);

                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
                len--;
            }
            res.add(list);
        }
        return res;
    }
}
