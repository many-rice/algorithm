package leetcode.t15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: chentao_sx
 * @Date: 2018/6/21 15:56
 * Title: 15. 三数之和(未解决)
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            int l = i+1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    List<Integer>  tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    if(!res.contains(tmp)) res.add(tmp);
                }
                if(sum > 0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{-1,0,1}).toString());
    }
}
