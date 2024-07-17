/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        int res = 0;

        while (l1 != null || l2 != null || res != 0) {
            ListNode cur = new ListNode();
            if (l1 != null) {
                res += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                res += l2.val;
                l2 = l2.next;
            }
            cur.val = res % 10;
            res /= 10; // since we only want first digit as we're going backwards
            tail.next = cur;
            tail = tail.next;
        }

        return head.next;
    }
}