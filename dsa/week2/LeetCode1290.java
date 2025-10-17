public class LeetCode1290 {
    public int getDecimalValue(ListNode head) {
    ListNode current = head;
    String num = "";
    while (current != null) {
        num = num + current.val;
        current = current.next;
    }

    return Integer.parseInt(num, 2);
}
}