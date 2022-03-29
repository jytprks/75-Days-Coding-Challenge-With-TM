package com.jyoti.days4;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3};
        nextPermutation(arr);
    }

    public static void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) i--;
        if(i >= 0) {
            int j = nums.length - 1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void  reverse(int[] nums, int i, int j) {
        while(i < j) swap(nums, i++, j--);
    }
}
