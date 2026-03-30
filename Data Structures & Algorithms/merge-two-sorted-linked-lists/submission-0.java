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
        if(list1==null && list2 == null)return list1;
        if(list1==null)return list2;
        else if(list2 == null)return list1;
        ListNode dummy = new ListNode();
        ListNode curr = new ListNode();
        ListNode curr1 = list1,curr2=list2;
        if(curr1.val<curr2.val){
            
            dummy.next = curr1;
            dummy=dummy.next;
        }
        else{
            
            dummy.next = curr2;
            dummy=dummy.next;
        }
        while(curr1!=null&&curr2!=null){
            if(curr1.val<curr2.val){
                curr.next = curr1;
                curr1=curr1.next;
                curr=curr.next;
            }
            else{
                curr.next = curr2;
                curr2=curr2.next;
                curr=curr.next;
            }
        }
        while(curr2!=null){
            curr.next = curr2;
            curr2=curr2.next;
            curr=curr.next;
        }
        while(curr1!=null){
            curr.next = curr1;
            curr1=curr1.next;
            curr=curr.next;
        }
        return dummy;
    }
}