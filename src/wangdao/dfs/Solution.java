package wangdao.dfs;

import sun.security.util.Length;

/**
 * @Author: chentao_sx
 * @Date: 2018/6/26 14:17
 * Title: 深度优先遍历算法
 */
public class Solution {
    public boolean [] flag;
    public int [][] map;

    public void init(){
        flag = new boolean[5];
        for(int i=0;i<flag.length;i++){
            flag[i] = false;
        }
        map = new int[5][5];
//        map[0][1]=1;
//        map[1][0]=1;
        map[1][2]=1;
        map[2][1]=1;
        map[1][2]=1;
        map[2][3]=1;
        map[3][2]=1;
        map[0][3]=1;
        map[3][0]=1;
        map[2][4]=1;
        map[4][2]=1;
    }

    public void dfs(int i){
        flag[i]=true;
        System.out.println(i);
        for(int j=0;j<5;j++){
            if(flag[j] ==false && map[i][j]!=0){
                dfs(j);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution =  new Solution();
        solution.init();
        solution.dfs(0);
    }
}
