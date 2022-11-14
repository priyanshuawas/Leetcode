package Medium;
class Problem445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2= new Stack<>();
        while(l1 != null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2= l2.next;
        }
        int carry=0;
        ListNode newhead = null;
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            int newhead1= s1.isEmpty() ? 0 : s1.pop();
            int newhead2= s2.isEmpty() ? 0 : s2.pop();
            int temp = newhead1+ newhead2 + carry;
            ListNode newNode= new ListNode(temp % 10);
            newNode.next= newhead;
            newhead= newNode;
            carry=temp/10;
        }
        return newhead;
    }
}