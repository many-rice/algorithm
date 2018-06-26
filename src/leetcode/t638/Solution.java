package leetcode.t638;

/**
 * @Author: chentao_sx
 * @Date: 2018/6/26 15:30
 * Title:三个数的最大乘积
 */
public class Solution {
    public int maximumProduct(int[] nums) {
        int [] flag =new int[2001];
        for(int i:nums){
            flag[i+1000] ++;
        }
        int sum1 = 1;
        int sum2 = 1;
        int t =3;
        for(int i=2000;i>=0;i--){
            int s =flag[i];
            while (s!=0){
                sum1 = sum1 * (i-1000);
                t--;
                s--;
                if(t ==0) break;
            }
            if(t==0) break;
        }
        t=2;
        for(int i=0;i<=2000;i++){
            int s =flag[i];
            while (s!=0){
                sum2 = sum2 * (i-1000);
                t--;
                s--;
                if(t ==0) break;
            }
            if(t==0) break;
        }
        for(int i=2000;i>=0;i--){
            if(flag[i]!=0){
                sum2 = sum2 * (i-1000);
                break;
            }
        }
        if(flag[1000] != 0) return Math.max(Math.max(sum1,sum2),0);
        return Math.max(sum1,sum2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maximumProduct(new int[]{1,2,3});
    }

}
