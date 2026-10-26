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
        ListNode temp=head;
        ListNode prev=null;
        ListNode f=head;

        for(int i=0;i<n;i++){
            f=f.next;
        }
        while(f!=null){
            prev=temp;
            temp=temp.next;
            f=f.next;
             
        }
        if(prev==null){
            return head.next;
        }
        prev.next=temp.next;
        return head;
    }
}