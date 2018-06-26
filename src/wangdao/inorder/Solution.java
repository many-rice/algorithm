package wangdao.inorder;

import java.util.Stack;

/**
 * @Author: chentao_sx
 * @Date: 2018/6/25 17:12
 * Title: 中序遍历非递归
 */
public class Solution {
    public void inorder(Tree root){
        Stack<Tree> stack =  new Stack();
        Tree p = root;
        while (p!=null || !stack.isEmpty()){
            if(p!=null){
                stack.push(p);
                p = p.left;
            }else{
                p = stack.pop();
                System.out.println(p.val);
                p = p.right;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Tree t1 = new Tree(1);
        Tree t2 = new Tree(2);
        Tree t3 = new Tree(3);
        Tree t4 = new Tree(4);
        Tree t5 = new Tree(5);
        Tree t6 = new Tree(6);
        Tree t7 = new Tree(7);
        t4.left = t2;
        t4.right = t7;
        t2.left = t1;
        t2.right = t3;
        t7.left = t6;
        t6.left = t5;
        solution.inorder(t4);

    }
}

class Tree {
    public int val;
    public Tree left;
    public Tree right;

    public Tree(int val){
        this.val = val;
    }
}
