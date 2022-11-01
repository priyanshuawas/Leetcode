package Easy;

import javax.swing.tree.TreeNode;

class Problem543 {
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        depth(root);
        return diameter;

        
    }
    public int depth(TreeNode node){
        if(node==null){
            return 0;

        }
        int L=depth(node.left);
        int R= depth(node.right);
        diameter= Math.max(diameter,L+R);
        return 1 + Math.max(L,R);

    }
}