package jianzhioffer.t3p10;

import java.util.HashSet;

public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for(int i = 0; i<length; i++){
            int tmp = numbers[i];
            if(tmp >= length){
                tmp -= length;
            }
            if(numbers[tmp] >= length){
                duplication[0] = tmp;
                return true;
            }
            numbers[tmp] += length;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.duplicate(new int[]{2,3,1,0,2,5,3},7,new int[1]));
    }
}
