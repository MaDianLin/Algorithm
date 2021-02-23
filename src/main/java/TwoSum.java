/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class TwoSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;

        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum > 9 ? 1 : 0;
            ListNode listNode = new ListNode(sum % 10);
            if (head == null)
                head = tail = listNode;
            else {
                tail.next = listNode;
                tail = tail.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1!=null){
            int sum = l1.val  + carry;
            carry = sum > 9 ? 1 : 0;
            ListNode listNode = new ListNode(sum % 10);

            tail.next = listNode;
            tail = tail.next;
            l1 = l1.next;
        }
        while (l2 !=null){
            int sum = l2.val + carry;
            carry = sum > 9 ? 1 : 0;
            ListNode listNode = new ListNode(sum % 10);

            tail.next = listNode;
            tail = tail.next;
            l2 = l2.next;
        }
        if (carry > 0){
            tail.next = new ListNode(1);
        }

        return head;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
