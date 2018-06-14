package jianzhioffer.ti27;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str !=null && !str.isEmpty()){
            PermutationHelper(str.toCharArray(),0,res);
        }
        Collections.sort(res);
        return res;
    }
    public void PermutationHelper(char a[],int index,ArrayList res){
        if(a.length -1 == index){
            if(!res.contains(String.valueOf(a))){
                res.add(String.valueOf(a));
            }
        }else{
            for(int j=index;j<a.length;j++){
                swap(a,index,j);
                PermutationHelper(a,index+1,res);
                swap(a,index,j);
            }
        }
    }
    public void swap(char a[],int s1,int s2){
        char tmp = a[s1];
        a[s1]=a[s2];
        a[s2]=tmp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<String> s =solution.Permutation("abc");
        System.out.println(s.toString());
    }
}
