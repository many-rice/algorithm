package leetcode.t113;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class Solution {

    private List<List<Integer>> result;
    private List<Integer> l;
    private int cursum = 0;
    private int sum ;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        result = new ArrayList<>();
        if(root == null) return result;
        this.sum = sum;
        l = new ArrayList<>();
        findSum(root);
        return result;
    }

    public void findSum(TreeNode node){
        if(node==null) return ;
        l.add(node.val);
        cursum += node.val;
        if(node.left == null && node.right == null && sum == cursum){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i < l.size(); i++){
                list.add(l.get(i));
            }
            result.add(list);
        }
        if(node.left != null){
            findSum(node.left);
        }
        if(node.right != null){
            findSum(node.right);
        }
        cursum -= node.val;
        l.remove(l.size() - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode s1 = new TreeNode(5);
        TreeNode s2 = new TreeNode(4);
        TreeNode s3 = new TreeNode(8);
        TreeNode s4 = new TreeNode(11);
        TreeNode s5 = new TreeNode(13);
        TreeNode s6 = new TreeNode(4);
        TreeNode s7 = new TreeNode(7);
        TreeNode s8 = new TreeNode(2);
        TreeNode s9 = new TreeNode(5);
        TreeNode s10 = new TreeNode(1);
        s1.left = s2;
        s1.right = s3;
        s2.left = s4;
        s2.right = null;
        s3.left = s5;
        s3.right = s6;
        s4.left = s7;
        s4.right = s8;
        s6.left = s9;
        s6.right = s10;
        System.out.println(solution.pathSum(s1,22));
    }
}
