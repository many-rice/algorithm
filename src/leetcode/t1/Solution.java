package leetcode.t1;


import java.util.HashMap;
import java.util.Map;

/**
 * @Author: chentao_sx
 * @Date: 2018/6/21 15:44
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                return new int[]{i,map.get(target - nums[i])};
            }
        }
        return null;
    }
}
