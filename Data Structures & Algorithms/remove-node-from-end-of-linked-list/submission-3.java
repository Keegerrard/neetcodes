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
        if(head == null)return null;
        
        if(n==1&& head.next==null)return null;
        int len = 0;
        ListNode curr = head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int tes = len-n+1;
        System.out.println(tes);
        int counter = 2;
        ListNode tracer = head.next;
        ListNode tail = head;
        if (tes == 1) return head.next;
        if(tes==1&& len==2)return head.next;
        while(counter!=tes){
            tracer=tracer.next;
            counter++;
            tail=tail.next;
        }
        if(tracer.next == null){
            tail.next=null;
        }
        else{
        tail.next = tracer.next;
        }
        tracer.next=null;
        return head;
    }
}
