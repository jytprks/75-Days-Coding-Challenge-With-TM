package com.jyoti.days8;

import java.util.Arrays;

public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {

    public static void main(String[] args){
        System.out.println(maxArea(1000000000,1000000000,new int[]{2},new int[]{2}));
    }
    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        return (int)((long)maxCut(h, horizontalCuts) * maxCut(w,verticalCuts)   % 1000000007);
    }

    //todo get maxCuts
    public static int maxCut(int total, int[] numberOfCuts){
        int maxCutResult = 0;
        for(int i =0; i<= numberOfCuts.length; i++){
            if (i  == 0)
                maxCutResult = Math.max(maxCutResult,numberOfCuts[i]);
            else if ( i == numberOfCuts.length)
                maxCutResult = Math.max(maxCutResult, total - numberOfCuts[i-1]);
            else
                maxCutResult = Math.max(maxCutResult, numberOfCuts[i] - numberOfCuts[i-1]);
        }
        return maxCutResult;
    }
}
