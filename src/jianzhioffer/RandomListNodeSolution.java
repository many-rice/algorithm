package jianzhioffer;

public class RandomListNodeSolution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null) return null;
        RandomListNode randomListNode =new RandomListNode(pHead.label);
        RandomListNode next = randomListNode;
        RandomListNode pHeadNext = pHead.next;
        while(pHeadNext != null){
            next.next = new RandomListNode(pHeadNext.label);
            next = next.next;
            pHeadNext = pHeadNext.next;
        }
        pHeadNext = pHead;
        next =randomListNode;
        while(pHeadNext !=null){
            RandomListNode random = pHeadNext.random;
            if(random != null){
                RandomListNode tmp = pHead;
                RandomListNode tmp1 = randomListNode;
                while(tmp !=random){
                    tmp = tmp.next;
                    tmp1 = tmp1.next;
                }
                next.random = tmp1;
            }
            next = next.next;
            pHeadNext = pHeadNext.next;
        }
        return randomListNode;
    }
}
