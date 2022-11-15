package Medium;
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
class Problem328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        
        }
        ListNode odd = head, even= head.next, eventail= even;

        while(eventail != null && eventail.next != null){
            odd.next= eventail.next;
            eventail.next=eventail.next.next;
            odd.next.next= even;
            odd= odd.next;
            eventail=eventail.next;


        }
        return head;

        
    }
