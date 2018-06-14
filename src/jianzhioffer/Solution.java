package jianzhioffer;

import java.util.ArrayList;

public class Solution {
    public ArrayList<TreeNode> path = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root ==null) return res;
        findLeafNode(root,target);
        return res;
    }

    public void findLeafNode(TreeNode node,int target){
        path.add(node);
        if(node.left == null && node.right == null){
            if(node.val == target) {
                ArrayList<Integer> tmp =new ArrayList<>();
                for(int i=0;i<=path.size()-1;i++){
                    tmp.add(path.get(i).val);
                }
                res.add(tmp);
            }
            return ;
        }
        if(node.left!=null){
            findLeafNode(node.left,target-node.val);
        }
        if(path.size()!=0)
        path.remove(path.size()-1);
        if(node.right!=null){
            findLeafNode(node.right,target-node.val);
        }
        if(path.size()!=0)
        path.remove(path.size()-1);
    }
}
