package leetcode.t375;

/**
 * 动态规划
 */
public class Solution {
    public int getMoneyAmount(int n) {
        int[][] d = new int[n+1][n+1];
        for(int j = 2;j <= n ; j++){
            for(int i = j-1;i >= 1; i--){
                int x = Integer.MAX_VALUE;
                for(int k = i+1 ; k < j; k++){
                    int localValue = k + Math.max(d[i][k-1],d[k+1][j]);
                    x = Math.min(localValue,x);
                }
                d[i][j] = i+1 == j ? i : x;
            }
        }
        return d[1][n];
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();
        System.out.println(solution.getMoneyAmount(4));
    }
}
