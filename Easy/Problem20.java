package Easy;

import java.util.List;

class Problem206 {
    public ListNode reverseList(List head) {
        if(head == null){
            return null;
        }
        else if(head.next== null){
            return head;
        }
        else{
            ListNode nextNode= head.next;
            head.next=null;              // With the help of Recurion 
            ListNode rest= reverseList(nextNode);
            nextNode.next=head;
            return rest;
        }

        
    }
}