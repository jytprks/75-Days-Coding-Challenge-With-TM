package com.jyoti.days3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args){
        System.out.println(generate(6));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(res.get(i-1).get(j - 1) + res.get(i-1).get(j));
            res.add(row);
        }
        return res;
    }
}
