package jianzhioffer.t3p15;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    HashSet<ListNode> set =new HashSet<>();

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode p = pHead;
        while(p!=null){
            if(set.contains(p))
                return p;
            set.add(p);
            p = p.next;
        }
        return null;
    }
}
