package leetcode.t525;

import java.util.HashMap;
import java.util.Map;

/**
 * 连续数组
 *
 给定一个二进制数组, 找到含有相同数量的 0 和 1 的最长连续子数组。
 */
public class Solution {
    public int findMaxLength(int[] nums) {
        for(int i = 0 ;i < nums.length ; i++ ){
            if(nums[i] == 0) nums[i] = -1;
        }
        int sum = 0;
        int maxLength = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0 ; i < nums.length; i++){
            sum += nums[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                int length = i - map.get(sum);
                maxLength = maxLength > length ? maxLength : length;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMaxLength(new int[]{0,1}));
    }
}
