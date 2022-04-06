package com.jyoti.days13;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args){
        System.out.println(characterReplacement("AABABBA",1));
    }



    public static int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxLen = 0, maxRep =0;
        Map<Character, Integer> numChar = new HashMap<>();
        while (right < s.length()){
            numChar.put(s.charAt(right), numChar.getOrDefault(s.charAt(right),0)+1);
            maxRep = Math.max(maxRep, numChar.get(s.charAt(right)));

            if ((right - left +1) - maxRep > k){
                numChar.put(s.charAt(left),numChar.get(s.charAt(left)) -1);
                left ++;
            }

            maxLen =  Math.max(maxLen, right -left +1);
            right ++;
        }
        return maxLen;
    }
}
