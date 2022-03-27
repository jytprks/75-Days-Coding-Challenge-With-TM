package com.jyoti.day1;

import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args){
        int[] arr = new int[]{9,9,9,9,9,9,9,9,9,9};
        System.out.println(Arrays.toString(plusOneOptimal(arr)));
    }
    public static int[] plusOne(int[] digits) {
        long value = 0;
        long multiply = 1;
        for (int i = digits.length - 1; i >= 0 ; i--){
            value += digits[i] * multiply;
            multiply *= 10;
        }
        value += 1;
        System.out.println(Long.toString(value));
        String valueString = Long.toString(value);
        int[] result = new int[Long.toString(value).length()];
        for (int i = 0; i < Long.toString(value).length(); i++){
            result[i] = valueString.charAt(i)  - '0';
        }
        return result;
    }

    public static int[] plusOneOptimal(int[] digits) {
        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}
