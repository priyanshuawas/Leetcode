package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Problem429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<Node> qu = new LinkedList<>();

        qu.offer(root);

        while(!qu.isEmpty()) {
            int size = qu.size();
            List<Integer> nodesAtOneLevel = new ArrayList<>();
            while(size-->0){
                Node head = qu.poll();
                nodesAtOneLevel.add(head.val);
                for(Node child : head.children){
                    qu.offer(child);
                }
            }
            ans.add(nodesAtOneLevel);
        }

        return ans;
    }
}
