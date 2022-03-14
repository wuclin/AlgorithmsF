/**
 * 倒数第k个链表
 */
public class demo20 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur = head;
        ListNode pre = head;
        for (int i=1; i<=k; i++)
            cur = cur.next;
        while(cur != null){
            pre = pre.next;
            cur = cur.next;
        }
        return pre;
    }
}
