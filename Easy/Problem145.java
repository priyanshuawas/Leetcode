package Easy;
import java.util.LinkedList;
import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class problem145 {
    LinkedList<Integer> result = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return result;
    }

    public int postorder(TreeNode root){
        if(root == null){
            return 0;
        }
        postorder(root.left);
        postorder(root.right);
        result.add(root.val);

        return 0;
    }
}