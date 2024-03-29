package Easy;

import javax.swing.tree.TreeNode;

class Problem110 {
    boolean result= true;
    public boolean isBalanced(TreeNode root) {
        validate(root);
        return result;
           
    }
    protected  int validate(TreeNode root){
        if(root == null){
            return 0;
        }
        int l= validate(root.left);
        int r= validate(root.right);
        if(Math.abs(l-r)>1){
            result = false;
        }
        return 1 + Math.max(l, r);
        return 1;

    }

}





