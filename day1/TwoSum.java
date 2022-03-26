package com.jyoti.day1;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void  main(String[] args){
        int[] arr= new int[] {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
        System.out.println(Arrays.toString(twoSumOptimalSolution(arr,6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return  result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumOptimalSolution(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < nums.length;  i++){
            int b = target -nums[i];
            if (hashMap.containsKey(b)){
                return  new int[] {hashMap.get(b),i};
            }
            else
                hashMap.put(nums[i],i);
        }
        return null;
    }
}
