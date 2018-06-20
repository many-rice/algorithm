package leetcode.minimum_window_substring;

public class Solution {
    public String minWindow(String S, String T) {
        int[] map = new int[128];
        int head = 0;
        for(int i =0;i< T.length();i++) {
            map[T.charAt(i)]++;
        }
        int begin = 0,end =0,d=Integer.MAX_VALUE,counter = T.length();
        while(end < S.length()){
            if(map[S.charAt(end++)] -- >0){
                counter -- ;
            }
            while (counter ==0){
                if(d > end - begin)
                    d = end - (head = begin);
                if(map[S.charAt(begin++)] ++ ==0){
                    counter++;
                }
            }
        }
        return d==Integer.MAX_VALUE ? "" : S.substring(head,head+d);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("ab","b"));
    }
}
