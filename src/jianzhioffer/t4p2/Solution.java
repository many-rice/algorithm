package jianzhioffer.t4p2;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null) return null;
        int order = TreeSizeinleft(pRoot.left)+1;
        if(k == order) return pRoot;
        else if(k < order) return KthNode(pRoot.left,k);
        else return KthNode(pRoot.right,k-order);
    }
    int TreeSizeinleft(TreeNode node){
        if(node == null) return 0;
        return TreeSizeinleft(node.left)+TreeSizeinleft(node.right)+1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode p1 = new TreeNode(8);
        TreeNode p2 = new TreeNode(6);
        TreeNode p3 = new TreeNode(10);
        TreeNode p4 = new TreeNode(5);
        TreeNode p5 = new TreeNode(7);
        TreeNode p6 = new TreeNode(9);
        TreeNode p7 = new TreeNode(11);
        p1.left = p2;
        p1.right = p3;
        p2.left = p4;
        p2.right = p5;
        p3.left = p6;
        p3.right = p7;
        solution.KthNode(p1,1);
    }
}
