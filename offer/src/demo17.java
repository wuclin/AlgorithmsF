/**
 * 删除链表的节点
 */
public class demo17 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode q = dummy;
        ListNode p = head;
        while(p != null){
            if (p.val == val){
                q.next = p.next;
                break;
            }
            q = p;
            p = p.next;
        }

        return dummy.next;
    }
}
