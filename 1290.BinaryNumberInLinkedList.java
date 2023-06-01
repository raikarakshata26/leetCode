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
    public int getDecimalValue(ListNode head) {
       int len=0,sum=0;
       ListNode temp= head;
       
     //Approach 1:  
     /*  while(temp!=null){
        len++;
        temp= temp.next;
       }
        len--;
        temp=head;
        while(temp!=null){
            sum+= temp.val * Math.pow(2, len--);
            temp=temp.next;
        }
        return sum;

    */
    //Approach2:
        while(temp!=null){
            sum = 2*sum + temp.val;
            temp=temp.next;
        }
        return sum;
    }
}
