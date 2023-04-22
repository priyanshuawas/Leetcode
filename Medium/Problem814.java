package Medium;

class Problem814 {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return root;
        boolean left = true, right = true;
        if(root.left != null){
            left = pruneNode(root.left);
            if(left) root.left = null;
        }
        if(root.right != null){
            right = pruneNode(root.right);
            if(right) root.right = null;
        }
        if(left && right && root.val == 0){
            root = null;
        }
        return root;
    }
    private boolean pruneNode(Object right2){
        if(right2.val == 0 && right2.left == null && right2.right == null) return true;
        else{
            boolean left = true, right = true;
            if(right2.left != null){
                left = pruneNode(right2.left);
                if(left) right2.left = null;
            }
            if(right2.right != null){
                right = pruneNode(right2.right);
                if(right) right2.right = null;
            }
            return (left && right) && right2.val == 0;
        }
    }
}