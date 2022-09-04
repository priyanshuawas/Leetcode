package Hard;
class Problem987 {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        class Group{
            TreeNode treeNode;
            int dis;
            int vd;
            Group(TreeNode treeNode, int dis, int vd){
                this.treeNode = treeNode;
                this.dis = dis;
                this.vd = vd;
            }
        }
        List<List<Integer>> ans = new ArrayList();
        if( root == null)   return ans;
        Map<Integer,List< Group>> dic = new HashMap();
        List<Group > list = new ArrayList();
        Queue<Group> queue = new LinkedList();
        queue.add(new Group(root, 0, 0));
        int minDis = Integer.MAX_VALUE;
        int maxDis = Integer.MIN_VALUE;
        
        while( ! queue.isEmpty() ){
            Group group = queue.poll();
            
            minDis = Math.min(minDis, group.dis);
            maxDis = Math.max(maxDis, group.dis);
            
            if( group.treeNode.left !=null ) {
                queue.add(new Group(group.treeNode.left, group.dis-1, group.vd+1) );
            }
            if( group.treeNode.right !=null){
                queue.add(new Group(group.treeNode.right, group.dis+1, group.vd+1) );
            }
            if( dic.containsKey(group.dis)){
                list = dic.get(group.dis);
                list.add(group);
                dic.put(group.dis,new ArrayList(list ));
                list.clear();
            }
            else{
                list.add(group );
                dic.put(group.dis, new ArrayList(list));
                list.clear();
            }
         }
        
        int index = 0;
        for(int d = minDis; d <= maxDis; d++ ){
            list =  dic.get(d);
            Collections.sort(list, (a,b) -> {
                
                if( a.vd == b.vd)   return a.treeNode.val - b.treeNode.val ;
                else
                    return a.vd - b.vd;
            
            } );
            
            ans.add(new ArrayList());
            
             for(Group g : list){
                 ans.get(index).add(g.treeNode.val);
             }
            
            index++;
        }
        return ans;
    }
}