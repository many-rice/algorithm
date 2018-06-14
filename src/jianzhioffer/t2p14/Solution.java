package jianzhioffer.t2p14;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        Character res='a';
        Iterator<Map.Entry<Character,Integer>> iterable=map.entrySet().iterator();
        while(iterable.hasNext()) {
            Map.Entry<Character,Integer> entry = iterable.next();
            if(entry.getValue()==1){
                res=entry.getKey();
                break;
            }
        }
        for(int i=0;i<str.length();i++){
            if(res == str.charAt(i)) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.FirstNotRepeatingChar("bacdfeadb"));
    }
}
