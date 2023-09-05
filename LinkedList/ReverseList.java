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
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode temp = null;

        while(current != null){
            //Iterate through the list
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        head = previous;

        return head;

    }
}