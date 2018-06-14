package jianzhioffer.t3p20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;
        queue.offer(pRoot);
        int start = 0,end = 1;
        ArrayList<Integer> tmp = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            start++;
            tmp.add(node.val);
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
            if(start == end){
                start = 0;
                end = queue.size();
                res.add(tmp);
                tmp = new ArrayList<>();
            }
        }
        return  res;
    }
}
