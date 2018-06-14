package jianzhioffer.t3p12;

public class Solution {
    public boolean match(char[] str, char[] pattern) {
        if(str == null || pattern == null)
            return true;
        return matchCode(str,0,pattern,0);
    }

    public boolean matchCode(char[] str, int strIndex,char[] pattern,int patternIndex){
        if(str.length == strIndex && pattern.length == patternIndex) return true;
        if(str.length != strIndex && pattern.length == patternIndex) return false;
        if(patternIndex +1 < pattern.length && pattern[patternIndex+1] == '*'){
            if((strIndex < str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex < str.length)){
                return matchCode(str,strIndex,pattern,patternIndex+2) || matchCode(str,strIndex+1,pattern,patternIndex+2) || matchCode(str,strIndex+1,pattern,patternIndex);
            }else{
                return matchCode(str, strIndex, pattern, patternIndex + 2);
            }
        }
        if((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] =='.' && strIndex !=str.length)){
            return matchCode(str,strIndex+1,pattern,patternIndex+1);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println();
    }
}
