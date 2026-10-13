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
        ListNode previous=null;
        ListNode temp=head;

        while(temp!=null){
            ListNode next=temp.next;

            temp.next=previous;
            previous=temp;
            temp=next;
        }
        return previous;
    }
}