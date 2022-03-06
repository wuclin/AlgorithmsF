import java.util.Stack;

/**
 * 从尾到头打印链表
 */
public class demo4 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        while(head != null){
            stack.add(head.val);
            head = head.next;
        }

        int[] a = new int[stack.size()];
        for (int i = 0; i < a.length; i++)
            a[i] = stack.pop();

        return a;
    }
}
