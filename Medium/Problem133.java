package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import org.w3c.dom.Node;

class Problem133 {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Map<Node,Node>map=new HashMap<>();
        Queue<Node>q=new LinkedList<>();

        q.add(node);
        map.put(node,new Node(node.val,new ArrayList<>()));

        while(!q.isEmpty()){
            Node n=q.peek();
            q.poll();

            for(Node e:n.neighbors){
                if(!map.containsKey(e)){
                    map.put(e,new Node(e.val,new ArrayList<>()));
                    q.add(e);
                }
                map.get(n).neighbors.add(map.get(e));
            }
        }
        return map.get(node);
        
    }
}
