package jianzhioffer.t3p14;

public class Solution {
    int[] hashtable = new int[256];
    StringBuffer buffer = new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch) {
        buffer.append(ch);
        if(hashtable[ch]==0){
            hashtable[ch]=1;
        }else{
            hashtable[ch]+=1;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] str = buffer.toString().toCharArray();
        for(char c: str){
            if(hashtable[c]==1){
                return c;
            }
        }
        return '#';
    }
}
