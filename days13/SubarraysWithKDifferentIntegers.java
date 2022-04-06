package com.jyoti.days13;

import java.util.HashMap;

public class SubarraysWithKDifferentIntegers {

    public static void main(String[] args){
        System.out.println(subarraysWithKDistinct(new int[]{1,2,1,2},2));
    }

    public static int subarraysWithKDistinct(int[] A, int K) {
        return  getCount(A, K) - getCount(A,K-1);
    }

    //get almost count
    public static int getCount(int[] arr, int k){
        int left = 0, right =0, result =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < arr.length){
            map.put(arr[right], map.getOrDefault(arr[right],0)+1);


            // todo reducing the window size
            while (left <= right && map.size() > k){
                if(map.containsKey(arr[left]))
                    map.put(arr[left],map.get(arr[left])-1);
                if (map.get(arr[left]) == 0)
                    map.remove(arr[left]);
                left ++;
            }

            result += (right - left +1);
            right++;
        }
        return result;
    }
}
