package jianzhioffer.t3p9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int StrToInt(String str) {
        String regex=".*[a-zA-Z]+.*";
        Matcher m= Pattern.compile(regex).matcher(str);
        if(m.matches() || str.isEmpty()) return 0;
        int flag=0;
        if(str.charAt(0) == '+') {flag =1;str = str.substring(1,str.length());}
        else if(str.charAt(0) == '-') {flag = -1;str =str.substring(1,str.length());}
        int res = 0;
        for(int i=0;i<str.length();i++){
            res = (str.charAt(i) - '0') + res * 10;
        }
        if(flag != 0) res *= flag;
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.StrToInt("1a33"));
    }
}
