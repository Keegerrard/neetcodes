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
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next == null||head.next.next==null)return false;
        ListNode p1 = head;
        ListNode p2 = head;
        p2=p2.next;
        while(p2!=null){
            if(p2.next==null)return false;
            if(p2==p1)return true;
            p2 = p2.next.next;
            p1 = p1.next;
        }
        return false;
    }
}
