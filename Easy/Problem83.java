package Easy;
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
class   Problem83 {
    public List deleteDuplicates(Hard.List head) {
        if(head==null) 
            return head;
        Hard.List x=head;
        while(x.next!=null){
            if(x.val==x.next.val) x.next=x.next.next;
            else
            x=x.next;
        }
        return head;
    }
}
