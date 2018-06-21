package leetcode.t205;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: chentao_sx
 * @Date: 2018/6/21 16:36
 * Title:
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] aTob = new int[256];
        int [] bToa = new int[256];
        for(int i=0;i<s.length();i++){
            if(aTob[s.charAt(i)] ==0){
                aTob[s.charAt(i)] = t.charAt(i);
            }
            if(bToa[t.charAt(i)] == 0){
                bToa[t.charAt(i)] = s.charAt(i);
            }
            if(aTob[s.charAt(i)] !=t.charAt(i) || bToa[t.charAt(i)] != s.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("add","egg"));
    }
}
