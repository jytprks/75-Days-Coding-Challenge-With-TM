package com.jyoti.days6;

import java.util.*;

public class FourSum {
    public static void main(String[] args){
        int[] arr = new int[]{1,0,-1,0,-2,2};
        System.out.println(fourSum(arr,0));
    }

    public static  List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> resultArr = new HashSet<>();
        for (int i = 0; i<nums.length; i++){
            for (int j = i + 1; j<nums.length; j++){
                int k = j+1;
                int l = nums.length -1;
                while (k < l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target){
                        List<Integer> subArr = new ArrayList<>();
                        subArr.add(nums[i]);
                        subArr.add(nums[j] );
                        subArr.add(nums[k] );
                        subArr.add(nums[l]);
                        resultArr.add(subArr);
                        k++;
                        l--;
                    }else  if(sum< target) k++;
                    else l--;
                }
            }
        }
        return new ArrayList<>(resultArr);
    }
}
