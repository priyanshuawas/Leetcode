package Easy;

class Problem108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        TreeNode h=helper(nums,0,nums.length-1);
        return h;
    }
    public TreeNode helper(int[] nums,int l,int r){
        if(l>r){
            return null;
        }
        int mid=l+(r-l)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=helper(nums,l,mid-1);
        node.right=helper(nums,mid+1,r);
        return node;
    }
}
