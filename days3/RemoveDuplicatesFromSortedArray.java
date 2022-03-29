package com.jyoti.days3;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int start = 0;
        for (int i = 1; i< nums.length; i++){
            if (nums[i] !=  nums[start]){
                start ++;
                nums[start] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return start+1;
    }
}
