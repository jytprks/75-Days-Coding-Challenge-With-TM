package com.jyoti.days2;

public class MajorityElement {
    public static void main(String[] args){
        int[] arr = new int[]{3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums){
            if (count == 0) {
                candidate = num;
            }

                if (num == candidate) count++;
                else count --;
            }

        return candidate;
    }

}
