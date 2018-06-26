package wangdao.bfs;

import java.util.*;

/**
 * @Author: chentao_sx
 * @Date: 2018/6/26 14:37
 * Title: 广度优先遍历算法
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
        map[0][2]=1;
        map[2][0]=1;
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

    public void bfs(int i){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        flag[i]=true;
        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.println(x);
            for(int j = 0 ;j<5;j++){
                if(flag[j]==false&&map[x][j]!=0){
                    queue.offer(j);
                    flag[j]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.init();
        solution.bfs(0);
        Hashtable<Integer,Integer> table = new Hashtable<>();
        table.put(1,3);
        table.put(2,4);
        table.put(3,5);
        Enumeration ens = table.keys();
        while(ens.hasMoreElements()){
            System.out.println(ens.nextElement());
        }
    }

}
