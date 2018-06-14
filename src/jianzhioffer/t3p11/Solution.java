package jianzhioffer.t3p11;

public class Solution {
    public int[] multiply(int[] a) {
        int len = a.length;
        int[] b = new int[len];
        if(len >= 0){
            b[0] = 1;
            for(int i = 1;i < len;i++){
                b[i] = b[i-1] * a[i-1];
            }
            int temp = 1;
            for(int j = len - 2;j>=0;j--){
                temp  *= a[j+1];
                b[j] *= temp;
            }
        }
        return b;
    }
}
