import java.util.ArrayList;
import java.util.List;

/**
 * demo1-4 对应前中后序递归遍历,层次迭代遍历
 */
public class demo1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        Traversal(root, list);
        return list;
    }

    public void Traversal(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        list.add(root.val);
        Traversal(root.left, list);
        Traversal(root.right, list);
    }
}
