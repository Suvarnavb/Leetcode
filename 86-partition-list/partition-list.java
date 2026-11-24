
class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);

        ListNode s = small;
        ListNode b = big;

        while (head != null) {

            if (head.val < x) {
                s.next = head;
                s = s.next;
            } 
            else {
                b.next = head;
                b = b.next;
            }

            head = head.next;
        }

        b.next = null;
        s.next = big.next;

        return small.next;
    }
}
