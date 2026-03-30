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
        if(head==null)return head;
        ListNode temp = head;
        if(head.next == null)return head;
        
        ListNode curr = head.next;
        temp.next = null;
        while(curr!= null){
            head = curr;
            curr = curr.next;
            head.next=temp;
            temp = head;
        }
        return head;
    }
}
