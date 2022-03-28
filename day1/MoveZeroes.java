package com.jyoti.day1;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args){
        int[] arr = new int[]{0,1,0,3,12};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        int length  = nums.length;
        int zeroIndex = 0;
        for (int i = 0; i< length; i++){  // (i = 0 ; i < 3 ) ( i = 1 ; 1 < 2)
            if (nums[i] != 0){
                if (i != zeroIndex){
                    nums[zeroIndex] = nums[i];
                    nums[i] = 0;
                    zeroIndex ++;
                }else
                    zeroIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
