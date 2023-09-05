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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        //Traverse to the end of the list
        int i = 0;
        while(temp != null){
            temp = temp.next;
            i++;
        }
        if(n == i){
            head = head.next;
            return head;
        }
        ListNode f = head;
        int j = 0;
        //Traverse to correct node
        while(j < (i - n - 1)){
            f = f.next;
            j++;
        }
        //Set pointer to following one
        f.next = f.next.next;
        return head;
    }

}