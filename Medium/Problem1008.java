package medium;

import javax.swing.tree.TreeNode;

class Solution {
    int index;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0) return null;
        index=0;
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private TreeNode helper(int[] preorder,int start,int end){
        if(index==preorder.length || preorder[index]<start || preorder[index]>end) return null;

        int val=preorder[index++];
        TreeNode node=new TreeNode(val);
        node.left=helper(preorder,start,val);
        node.right=helper(preorder,val,end);
        return node;
    }
}