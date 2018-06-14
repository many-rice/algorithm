package jianzhioffer;

import javafx.scene.transform.Rotate;

public class TreeNodeSolution {
    public TreeNode Convert(TreeNode root) {
        if(root == null) return null;
        TreeNode left = Convert(root.left);
        TreeNode p = left;
        while(p!=null && p.right!=null){
            p = p.right;
        }
        if(left!=null){
            root.left = p;
            p.right = left;
        }
        TreeNode right= Convert(root.right);
        if(right!=null){
            root.right = right;
            right.left = root;
        }
        return left !=null?left:root;
    }
}
