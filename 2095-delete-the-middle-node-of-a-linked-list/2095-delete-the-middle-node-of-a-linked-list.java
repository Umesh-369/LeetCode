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
    public ListNode deleteMiddle(ListNode head) {
    // Method 1
    //   if(head==null || head.next==null){
    //     return null;
    //   }
    //   ListNode temp=head;
    //   int n=0;
    //   while(temp!=null){
    //     n++;
    //     temp=temp.next;
    //   }
    //   int res=n/2;
     
    //  temp=head;
    // //  while(temp!=null){
    // //     res--;
    // //     if(res==0){
    // //         ListNode mid=temp;
    // //         temp.next=temp.next.next;
    // //         break;
    // //     }
    // //     temp=temp.next;
    // //  }

    // for(int i=1;i<res;i++){
    //     temp=temp.next;
    // }
    // temp.next=temp.next.next;
    //  return head;

    // Method 2
    if(head==null || head.next==null){
        return null;
    }
    ListNode slow=head;
    ListNode fast=head.next.next;  //To skip 1 step of slow
    while( fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    slow.next=slow.next.next;
    return head;

    }
}