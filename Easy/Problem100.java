package Easy;

import javax.swing.tree.TreeNode;

class Problem100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;

        }
        if(q == null || p == null) {
            return false;

        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
    }
}