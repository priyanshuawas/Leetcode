package Medium;

import java.util.List;

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
    public List oddEvenList(List head) {
        if(head == null){
            return null;
        
        }
        List odd = head, even= (List) head.next, eventail= even;

        while(eventail != null && eventail.next != null){
            odd.next= eventail.next;
            eventail.next=eventail.next.next;
            odd.next.next= even;
            odd= (List) odd.next;
            eventail=(List) eventail.next;


        }
        return head;

        
    }
}
