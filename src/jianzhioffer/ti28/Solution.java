package jianzhioffer.ti28;

import java.util.*;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        HashMap<Integer,Integer> params = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(params.containsKey(array[i])){
                params.put(array[i],params.get(array[i])+1);
            }else{
                params.put(array[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:params.entrySet()){
            if(entry.getValue() > array.length /2 ){
                return entry.getKey();
            }
        }
        return 0;
    }

    public int MoreThanHalfNum_Solution1(int [] numbers) {
        int n=numbers.length;
        if(n==0) return 0;
        int num = numbers[0],count =1;
        for(int i=1;i<n;i++){
            if(numbers[i]==num) count++;
            else count--;
            if(count ==0){
                num = numbers[i];
                count =1;
            }
        }
        count =0;
        for(int i=0;i<n;i++){
            if(numbers[i]==num) count++;
        }
        if(count * 2 > n) return num;
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}