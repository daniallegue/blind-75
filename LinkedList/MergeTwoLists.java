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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Choose the smallest head
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode output = new ListNode();
        ListNode temp = output;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                temp = temp.next;
            }
            else{
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                temp = temp.next;
            }
        }

        //See if there are any remaining nodes
        while(l1 != null){
            temp.next = new ListNode(l1.val);
            l1 = l1.next;
            temp = temp.next;
        }

        while(l2 != null){
            temp.next = new ListNode(l2.val);
            l2 = l2.next;
            temp = temp.next;
        }

        return output.next;
    }
}