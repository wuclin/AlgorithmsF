import java.util.ArrayList;
import java.util.List;

public class demo3 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Traversal(root, list);
        return list;
    }

    public void Traversal(TreeNode root, List<Integer> list){
        if (root == null)
            return;
        Traversal(root.left, list);
        list.add(root.val);
        Traversal(root.right, list);
    }
}
