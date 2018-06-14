package jianzhioffer.t3p6;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if( n ==0 || m==0) return -1;
        boolean[] a = new boolean[n];
        for(int i = 0;i < a.length;i++){
            a[i] = true;
        }
        int cnt = n;
        int i = 0;
        int j = 1;
        while(cnt != 1){
            while(a[i] == false){
                i = (i+1)%n;
            }
            if(j == 0){
                a[i] = false;
                cnt --;
            }
            j = (j+1)%m;
            i = (i+1)%n;
        }
        int res = 0;
        for(int x=1;x<a.length;x++){
            if(a[x]==true) res=x;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.LastRemaining_Solution(5,3));
    }
}
