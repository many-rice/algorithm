package jianzhioffer.t2p11;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        int i = 1;
        for(i=1;i<=n;i*=10){
            int a = n/i;
            int b = n%i;
            int s = a%10==1?1:0;
            res = res + (a+8)/10 * i + s*(b+1);
        }
        return res;
    }
}
