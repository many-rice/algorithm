package jianzhioffer.t3p17;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null) return null;
        if(pNode.right != null ) {
            TreeLinkNode node = pNode.right;
            while(node.left != null){
                node = node.left;
            }
            return node;
        }

        TreeLinkNode now =pNode;
        TreeLinkNode parent = pNode.next;
        while(parent != null){
            if(now == parent.left) return parent;
            now = parent;
            parent = parent.next;
        }
        return null;
    }
}
