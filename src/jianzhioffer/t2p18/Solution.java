package jianzhioffer.t2p18;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        treeNode.left=left;
        treeNode.right=new TreeNode(3);
        left.left=new TreeNode(4);
        Solution solution=new Solution();
        System.out.println(solution.TreeDepth(treeNode));
    }
}
