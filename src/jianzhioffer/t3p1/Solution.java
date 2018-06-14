package jianzhioffer.t3p1;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int n=(int)Math.sqrt(sum *2);n>=2;n--){
            if((n&1)==1 && sum%n==0 || (sum % n) *2==n){
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = 0, k = (sum / n) - (n - 1) / 2; j < n; j++, k++) {
                list.add(k);
                }
            res.add(list);
            }
        }
        return res;
    }
}
