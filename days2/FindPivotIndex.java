package com.jyoti.days2;

public class FindPivotIndex {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int i=0; i< nums.length; i++)
            totalSum += nums[i];

        int i =0;
        while (i < nums.length){
            if (leftSum == (totalSum - (leftSum + nums[i])))
                return i;
            leftSum += nums[i];
            i++;
        }

            return -1;

    }
}
