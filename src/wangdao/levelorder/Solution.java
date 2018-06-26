package wangdao.levelorder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: chentao_sx
 * @Date: 2018/6/25 17:35
 * Title: 层次遍历
 */
public class Solution {

    public void LevelOrder(Tree root){
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Tree p =queue.poll();
            System.out.println(p.val);
            if(p.left != null){
                queue.offer(p.left);
            }
            if(p.right != null){
                queue.offer(p.right);
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
        solution.LevelOrder(t4);
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