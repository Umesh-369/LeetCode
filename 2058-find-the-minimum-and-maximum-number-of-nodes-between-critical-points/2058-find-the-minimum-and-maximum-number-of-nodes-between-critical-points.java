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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null){
            return new int[]{-1,-1};
        }
      
        int first=-1;
        int last=-1;

        int min=Integer.MAX_VALUE;
        int max=0;

        ListNode prev=head;
        ListNode curr=head.next;

        int index=1;
        while(curr.next!=null){
           if( (curr.val>prev.val && curr.val>curr.next.val) ||
           (curr.val < prev.val && curr.val <curr.next.val) ){

              if(first==-1){
                first=index;
                last=index;
              }
              else{
                min=Math.min(min,index-last);
                last=index;

                max=Math.max(max,last-first);
              }
           }
            prev=curr;
            curr=curr.next;
            index++;
        }
         if(first==last){
            return new int[]{-1,-1};
         }

         return new int[]{min,max};
    }
}