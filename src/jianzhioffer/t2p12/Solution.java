package jianzhioffer.t2p12;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        List<Integer> s = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            s.add(numbers[i]);
        }
        Collections.sort(s,new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1= String.valueOf(o1);
                String s2= String.valueOf(o2);
                String r1=s1+s2;
                String r2=s2+s1;
                return r1.compareTo(r2);
            }
        });
        String result="";
        for(Object o:s){
            String t = String.valueOf(o);
            result+=t;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers= new int[]{3,32,321};
        System.out.println(solution.PrintMinNumber(numbers).toString());
    }
}
