package Easy;

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
class   Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) 
            return head;
        ListNode x=head;
        while(x.next!=null){
            if(x.val==x.next.val) x.next=x.next.next;
            else
            x=x.next;
        }
        return head;
    }
}
