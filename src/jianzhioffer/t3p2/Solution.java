package jianzhioffer.t3p2;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res=new ArrayList<>();
        int tmp = 999999999,l=0,r=array.length-1;
        while(l<=r){
           if(array[l]+array[r]==sum){
                if(tmp > array[l]*array[r]){
                    tmp = array[l]*array[r];
                    res.clear();
                    res.add(array[l]);
                    res.add(array[r]);
                }
               l++;
               r--;
            }else if(array[l]+array[r] >sum){
                r--;
            }else{
                l++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.FindNumbersWithSum(new int[]{1,2,3,4,5,6,7,8,9},10));
    }
}
