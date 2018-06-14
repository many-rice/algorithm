package jianzhioffer.t2p15;

import java.lang.reflect.Parameter;

public class Solution {
    int res=0;

    public int InversePairs(int [] array) {
//复杂度过大
//        int[] res=new int[array.length];
//        res[0]=0;
//        for(int i=1;i<res.length;i++){
//            int tmp=0;
//            for(int j=0;j<i;j++){
//                if(array[i]<array[j]){
//                    tmp++;
//                    tmp=tmp%1000000007;
//                }
//            }
//            res[i]=(tmp+res[i-1])%1000000007;
//        }
//        return res[res.length-1];
        if(array==null||array.length==0) return 0;
        mergeSort(array,0,array.length-1);
        return res;
    }

    public void mergeSort(int[] array,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(array,l,mid);
            mergeSort(array,mid+1,r);
            parition(array,l,mid,r);
        }
    }

    public void parition(int[] array,int l,int mid,int r){
        int[] k=new int[r-l+1];
        int i1=l,i2=mid+1;
        int i=0;
        while(i1<=mid&&i2<=r){
            if(array[i2]<array[i1]){
                res = (res+mid-i1+1)%1000000007;
                k[i]=array[i2++];
            }else{
                k[i]=array[i1++];
            }
            i++;
        }
        if(i1<=mid){
            while(i1<=mid){
                k[i]=array[i1];
                i++;
                i1++;
            }
        }
        if(i2<=r){
            while(i2<=r){
                k[i]=array[i2];
                i++;
                i2++;
            }
        }
        for(i=0;i<r-l+1;i++){
            array[l+i]=k[i];
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] a=new int[]{1,2,3,4,5,6,7,0};
        System.out.println(solution.InversePairs(a));
        System.out.println(111);
    }
}
