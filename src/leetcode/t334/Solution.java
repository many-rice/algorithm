package leetcode.t334;

/**
 * @Author: chentao_sx
 * @Date: 2018/6/26 15:56
 * Title: 递增的三元子序列
 */
public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int m1=Integer.MAX_VALUE,m2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(m1 >= nums[i]) m1 = nums[i];
            else if(m2 >= nums[i]) m2 = nums[i];
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().increasingTriplet(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
    }
}
