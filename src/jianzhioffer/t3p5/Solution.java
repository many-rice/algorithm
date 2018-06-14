package jianzhioffer.t3p5;

import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length==0) return false;
        Arrays.sort(numbers);
        int cnt = 0;
        int interval = 0;
        for(int i = 0;i < numbers.length-1;i++){
            if(numbers[i] == 0){
                cnt++;
                continue;
            }
            if(numbers[i] == numbers[i+1]){
                return false;
            }
            interval += numbers[i+1] - numbers[i] - 1;
        }
        if(interval > cnt) return false;
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isContinuous(new int[]{1,3,0,0,5}));
    }
}
