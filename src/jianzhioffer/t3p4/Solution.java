package jianzhioffer.t3p4;

public class Solution {
    public String ReverseSentence(String str) {
        if(str.trim().equals("")) return str;
        String[] s = str.split(" ");
        String res = "";
        for(int i=s.length-1;i>=0;i--){
            if(i ==0){
                res += s[i];
            }else{
                res += s[i] + " ";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.ReverseSentence(" student. a am I"));
    }
}
