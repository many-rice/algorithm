package jianzhioffer.t3p3;

public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str ==""||str.isEmpty())  return "";
        String s = str+str;
        n = n%str.length();
        return s.substring(n,n+str.length());
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.LeftRotateString("abcXYZdef",3));
    }
}
