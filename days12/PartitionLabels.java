package com.jyoti.days12;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public static void main(String[] args){
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }


    public static List<Integer> partitionLabels(String s) {
        int[] lastIndexMap = new int[26];
        List<Integer> partitionList = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            lastIndexMap[s.charAt(i)-'a'] = i;
        }



        int partitionStart = 0;
        int partitionEnd = 0;

        for(int i=0; i<s.length(); i++){
            partitionEnd= Math.max(partitionEnd, lastIndexMap[s.charAt(i)-'a']);
            if(i==partitionEnd){
                partitionList.add(partitionEnd-partitionStart + 1);
                partitionStart = i+1;
                partitionEnd = i+1;
            }
        }

        return partitionList;
    }
}
