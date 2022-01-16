public class demo8 {
    public int NmaxDepth(Node root) {
        if (root == null)
            return 0;
        int maxDepth = 0;
        for (Node child : root.children){
            int Depth = NmaxDepth(child);
            maxDepth = Math.max(Depth, maxDepth);
        }
        return maxDepth + 1;

    }
}
