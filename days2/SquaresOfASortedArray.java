package com.jyoti.days2;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args){
        int[] arr = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));

    }
    public static int[] sortedSquares(int[] nums) {
        int first = 0;
        int last = nums.length -1;
        int[] res = new int[nums.length];
        for (int i =nums.length - 1; i >=0; i--) {
            if((nums[first]*nums[first])>(nums[last] * nums[last])){
                res[i] = nums[first]*nums[first];
                first ++;
            }else{
                res[i] = nums[last]*nums[last];
               last --;
            }
        }
        return res;
    }
}
