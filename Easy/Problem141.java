package Easy;

import java.util.List;

public class Problem141 {
    public boolean hasCycle(List head) {
        if(head==null) return false;
        List slow=head;
        List fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        } 
        return false;
    }
}
