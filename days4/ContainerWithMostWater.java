package com.jyoti.days4;

public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] arr = new int[]{1,1};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while (i < j){
            int area = Math.min(height[i], height[j]) * (j - i);
            max = max < area ? area:max;
            if (height[i]>height[j]) j--;
            else i++;
        }
        return max;
    }
}
