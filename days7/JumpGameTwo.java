package com.jyoti.days7;

public class JumpGameTwo {

    public static void main(String[] args){
        int[] arr = new int[]{2,1};
        System.out.println(jump(arr));
    }

    public static int jump(int[] nums) {
        int farthestJump  =0;
        int jump = 0;
        int current = 0;
        for (int i =0; i<nums.length; i++){
            farthestJump = Math.max(farthestJump,i+nums[i]);
            if (current == i){
                if (current!=nums.length-1)
                jump +=1;
                current = farthestJump;
            }
        }
        return jump;
    }
}
