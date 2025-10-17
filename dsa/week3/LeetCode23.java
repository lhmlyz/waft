public class LeetCode23 {

    void main() {
        // [[1,4,5],[1,3,4],[2,6]]

        ListNode ln1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode ln2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode ln3 = new ListNode(2, new ListNode(6));
        
        ListNode[] lns = {ln1, ln2, ln3};
        mergeKLists(lns);

    }

    public void mergeKLists(ListNode[] lists) {
        for (ListNode ln : lists) {
            while(ln.next != null) {
                IO.println("val: " + ln.val + ", next: " + ln.next.val);
            }
    }
}

    class ListNode {
        int val;        
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}