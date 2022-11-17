package Medium;

class Problem24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode n=new ListNode(0);
        n.next=head;
        ListNode nhead=n;
        
        while(n.next!=null && n.next.next!=null){
            ListNode p1=n.next;
        ListNode p2=p1.next;
            ListNode nnode=p2.next;
            n.next=p2;
            p2.next=p1;
            p1.next=nnode;
            n=p1;
        }
        return nhead.next;
    }
}
