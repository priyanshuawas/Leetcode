package Easy;
import java.util.ArrayList;
import javax.swing.tree.TreeNode;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        count(root1,l1);
        count(root2,l2);
        if(l1.equals(l2))return true;
        return false;
    }
     public void count(TreeNode n,ArrayList<Integer> l)
     {
         if(n==null)return;
         if(n.left==null && n.right==null)
         {
            l.add(n.val);
            return;
         }
         count(n.left,l);
         count(n.right,l);
     }
}class Problem872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        count(root1,l1);
        count(root2,l2);
        if(l1.equals(l2))return true;
        return false;
    }
     public void count(TreeNode n,ArrayList<Integer> l)
     {

         if(n==null)return;
         if(n.left==null && n.right==null)
         {
            l.add(n.val);
            return;
         }
         count(n.left,l);
         count(n.right,l);
     }
}