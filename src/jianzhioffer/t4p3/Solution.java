package jianzhioffer.t4p3;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    int first = 0,second = 0;
    public void Insert(Integer num) {
        if(first == second) second++;
        else first++;
        list.add(num);
    }

    public Double GetMedian() {
        Collections.sort(list);
        return (Double.valueOf(list.get(first)+list.get(second)))/2.0;
    }

}
