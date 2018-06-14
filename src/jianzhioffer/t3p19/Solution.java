package jianzhioffer.t3p19;

import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(pRoot);
        int layer = 1;
        while(!s1.empty() || !s2.empty()){
            if(layer%2 != 0){
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!s1.empty()){
                    TreeNode node = s1.pop();
                    tmp.add(node.val);
                    if(node.left != null) s2.push(node.left);
                    if(node.right != null) s2.push(node.right);
                }
                res.add(tmp);
                layer++;
            }else{
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!s2.empty()){
                    TreeNode node = s2.pop();
                    tmp.add(node.val);
                    if(node.right != null) s1.push(node.right);
                    if(node.left != null) s1.push(node.left);
                }
                res.add(tmp);
                layer++;
            }
        }
        return res;
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
        System.out.println(solution.Print(p1).toArray().toString());
    }
}
