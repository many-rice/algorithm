package jianzhioffer.t2p19;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) return true;
        int leftDepth = this.findDepth(root.left);
        int rightDepth = this.findDepth(root.right);
        boolean flag = true;
        if(leftDepth - rightDepth <-1 || leftDepth - rightDepth > 1){
            flag = false;
        }
        return flag && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int findDepth(TreeNode node){
        if(node==null) return 0;
        return Math.max(findDepth(node.left),findDepth(node.right))+1;
    }
}
