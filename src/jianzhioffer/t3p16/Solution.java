package jianzhioffer.t3p16;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null) return pHead;
        if(pHead.val == pHead.next.val){
            ListNode p = pHead;
            while(p != null && pHead.val == p.val){
                p = p.next;
            }
            return deleteDuplication(p);
        }else{
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode p1 =new ListNode(1);
        ListNode p2 =new ListNode(1);
        ListNode p3 =new ListNode(1);
        ListNode p4 =new ListNode(1);
        ListNode p5 =new ListNode(1);
        ListNode p6 =new ListNode(1);
        ListNode p7 =new ListNode(1);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        solution.deleteDuplication(p1);
    }
}
