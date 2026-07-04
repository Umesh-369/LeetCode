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
    public ListNode middleNode(ListNode head) {
    // Approach 1   
    //    ListNode temp=head;
    //    int n=0;
    //    while(temp!=null){
    //       n++;
    //       temp=temp.next;
    //    }
    //    temp=head;
    //    int mid=n/2;
    //    for(int i=0;i<mid;i++){
    //      temp=temp.next;
    //    }
    //   return temp;

    // Approach 2
    ListNode slow=head;
    ListNode fast=head;

    while(slow!=null && fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
    }
}