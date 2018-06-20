package leetcode.t300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int[] d = new int[nums.length];
        d[0] = 1;
        int max = 1;
        for(int i =1; i<nums.length ;i++){
            for(int j = i;j>=0;j--){
                if(nums[i] > nums[j] && d[i] < d[j]+1){
                    d[i] = d[j]+1;
                    if(d[i] > max) max = d[i];
                }
            }
            if(d[i] == 0) d[i]=1;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLIS(new int[]{-2,-1}));
    }
}
