package jianzhioffer.t2p17;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        return this.biSearch(array,k+0.5)-this.biSearch(array,k-0.5);
    }

    public int biSearch(int [] array,double num){
        int l=0,r=array.length-1;
        while(l<=r){  //一定要小于等于
            int mid=(l+r)/2;
            if(array[mid]<num){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.GetNumberOfK(new int[]{3,3,3,3,4,5},3));
    }
}
