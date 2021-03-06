package leetcode.t235;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}



public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;
        if(root == p || root == q) return root;
        if((root.val < p.val && root.val > q.val) || (root.val > p.val && root.val < q.val)) return root;
        else if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right,p,q);
        else if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left,p,q);
        else return null;
    }
}
