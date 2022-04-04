package com.jyoti.days8;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args){
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length ==  0)
            return result;
        for (int i = 0; i < nums.length; i++){
            int pos = Math.abs(nums[i]);
            if (nums[pos -1] < 0){
                result.add(pos);
                continue;
            }
            nums[pos-1] = -nums[pos-1];
        }
        return result;
    }
}
