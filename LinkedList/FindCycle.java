/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        //Iterate trough list until cycle found
        while(p1 != null && p1.next != null){
            p2 = p2.next;
            p1 = p1.next.next;
            if(p2 == p1){
                //Cycle found
                return true;
            }
        }

        return false;
    }
}