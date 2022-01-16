import java.util.ArrayList;
import java.util.List;

public class demo2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Traversal(root, list);
        return list;
    }

    public void Traversal(TreeNode root, List<Integer> list){
        if (root == null)
            return;
        Traversal(root.left, list);
        Traversal(root.right, list);
        list.add(root.val);
    }
}
