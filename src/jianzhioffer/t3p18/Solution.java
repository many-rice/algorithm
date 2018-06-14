package jianzhioffer.t3p18;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class Solution {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null) return true;
        return isOK(pRoot.left,pRoot.right);
    }
    boolean isOK(TreeNode l,TreeNode r){
        if(l == null && r == null) return true;
        if((l != null && r == null) || (l == null && r!=null)) return false;
        return (l.val == r.val) && isOK(l.left,r.right) && isOK(l.right,r.left);
    }
}
