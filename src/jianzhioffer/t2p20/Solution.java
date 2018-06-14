package jianzhioffer.t2p20;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    //笨拙的比较方法
//    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
//        HashMap<Integer,Integer> map =new HashMap();
//        for(int i:array){
//            if(map.containsKey(i)){
//                map.put(i,map.get(i)+1);
//            }else{
//                map.put(i,1);
//            }
//        }
//        int flag=0;
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            if(entry.getValue()==1){
//                if(flag==0){
//                    num1[0]=entry.getKey();
//                    flag++;
//                }else{
//                    num2[0]=entry.getKey();
//                }
//            }
//        }
//
//    }
    //异或的比较方法
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int tmp=0;
        for(int i:array){
            tmp ^= i;
        }
        if(tmp ==0) return ;
        int index=0;
        while((tmp&1)!=1){
            tmp=tmp>>1;
            index++;
        }
        List<Integer> res1=new ArrayList<>();
        List<Integer> res2=new ArrayList<>();
        for(int i:array){
            if(IsBit(i,index) ==1){
                res1.add(i);
            }else{
                res2.add(i);
            }
        }
        int r1=0,r2=0;
        for(Integer i:res1){
            r1^=i;
        }
        for(Integer i:res2){
            r2^=i;
        }
        num1[0]=r1;
        num2[0]=r2;
        return ;
    }

    public int IsBit(int num,int index){
        num = num >>index;
        return num&1;
    }
}
