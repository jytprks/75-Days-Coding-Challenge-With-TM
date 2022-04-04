package com.jyoti.days8;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInAnArray {

    public static void main(String[] args){
        System.out.println(findPairs(new int[]{1,3,1,5,4},0));
    }

    public static int findPairs(int[] nums, int k) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num,0) + 1);

        for (int i: map.keySet())
            if ( (k > 0 && map.containsKey(i + k)) ||( k == 0 &&  map.get(i)>1))
                result ++;

        return result;
    }
}
