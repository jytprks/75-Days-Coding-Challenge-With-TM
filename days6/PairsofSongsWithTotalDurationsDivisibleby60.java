package com.jyoti.days6;

import java.util.HashMap;
import java.util.Map;

public class PairsofSongsWithTotalDurationsDivisibleby60 {
    public static void main(String[] args){
        int[] arr = new int[]{30,20,150,100,40};
        System.out.println(numPairsDivisibleBy60(arr));
    }
    public static int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int t : time){
            int rTime = t % 60;
            int theOther = rTime == 0? 0: 60 - rTime;
            ans += count.getOrDefault(theOther,0);
            count.put(rTime,1+count.getOrDefault(rTime,0));
        }
        return ans;
    }
}
