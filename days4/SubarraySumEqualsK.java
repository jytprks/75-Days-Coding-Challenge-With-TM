package com.jyoti.days4;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args){
        int[] arr = new int[]{1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr,k));
    }

    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
