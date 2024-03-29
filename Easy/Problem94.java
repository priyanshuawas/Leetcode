package Easy;
import java.util.ArrayList;
import java.util.Stack;
import Hard.List;
class Problem94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            list.add(stack.peek().val);
            node = stack.pop().right;
        }
        return list;
    }
}