package com.jyoti.days12;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args){
     int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
     System.out.println(Arrays.toString(nums));

    }
    public static void  sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length -1,temp = 0;
        while (m<=h){
            int value =  nums[m];
            switch (value){
                case 0:{
                    temp = nums[l];
                    nums[l] = nums[m];
                    nums[m] = temp;
                    l++;
                    m++;
                    break;
                }
                case 1:{
                    m++;
                    break;
                } case 2:{
                    temp = nums[m];
                    nums[m] = nums[h];
                    nums[h] = temp;
                    h--;
                    break;
                }
            }
        }
    }
}
