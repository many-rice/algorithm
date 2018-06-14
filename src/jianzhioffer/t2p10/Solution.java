package jianzhioffer.t2p10;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = 0;
        int max = -100000;
        for(int i: array){
            if(sum >0){
               sum += i;
            }else{
                sum = i;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{6,-3,-2,7,-15,1,2,2};
        System.out.println(solution.FindGreatestSumOfSubArray(a));
    }
}
