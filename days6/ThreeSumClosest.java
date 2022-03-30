package com.jyoti.days6;

import java.util.*;

public class ThreeSumClosest {
    public  static void main(String[] args){
        int[] nums = new int[] {0,0,0};
        System.out.println(threeSumClosest(nums,1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int close = nums[0] +  nums[1] + nums[2];


        Arrays.sort(nums);
        for (int i =0; i<nums.length -2; i++){
            int j = i+1;
            int k = nums.length-1;
            while (j < k){
                int sum = nums[j] + nums[k]+nums[i];
                if (Math.abs(sum - target) < Math.abs(close - target)) {
                    close = sum;
                }
               if (sum < target)
                   j++;
               else k--;
            }

        }
        return close;
    }
}
