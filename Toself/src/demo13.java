public class demo13 {
    public Node2 connect(Node2 root) {
        if (root == null)
            return null;
        connectTwoNode(root.left, root.right);
        return root;
    }

    public void connectTwoNode(Node2 root1, Node2 root2){
        if (root1 == null || root2 == null)
            return;

        root1.next = root2;
        connectTwoNode(root1.left, root1.right);
        connectTwoNode(root2.left, root2.right);
        connectTwoNode(root1.right, root2.left);
    }
}
