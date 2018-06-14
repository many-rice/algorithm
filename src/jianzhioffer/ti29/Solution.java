package jianzhioffer.ti29;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(k >input.length){
            for(int i=0;i<input.length;i++){
                res.add(input[i]);
            }
        }
        if(k <0){
            return res;
        }
        int index = this.kuaipai(input,0,input.length-1);
        int start = 0;
        int end = input.length-1;
        while (index !=k-1){
            if(k==-1) break;
            if(k-1<index){
                end= index-1;
                index = this.kuaipai(input,start,end);
            }else{
                start = index+1;
                index = this.kuaipai(input,start,end);
            }
        }
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }

    public int kuaipai(int [] a,int start,int end){
        if(start < end){
            int key = a[end];
            int i=start-1;
            for(int j=start;j<end;j++){
                if(a[j]<key){
                    swap(a,j,i+1);
                    i++;
                }
            }
            swap(a,i+1,end);
            return i+1;
        }
        return -1;
    }
    public void swap(int a[],int j,int i){
        int tmp = a[j];
        a[j]=a[i];
        a[i]=tmp;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] input=new int[]{4,5,1,6,2,7,3,8};
        ArrayList res =solution.GetLeastNumbers_Solution(input,4);
        System.out.println(res.toArray());
    }
}
