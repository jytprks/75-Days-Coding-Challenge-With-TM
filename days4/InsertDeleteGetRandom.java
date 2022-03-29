package com.jyoti.days4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandom {
    public static void main(String[] args){
        String[] methodsString = new String[]{"RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"};
        int[][] nums = new int[][]{{},{1},{2},{2},{},{1},{2},{}};
        RandomizedSet randomizedSet  = new RandomizedSet();
        for (int i=0; i< methodsString.length; i++){
            if (methodsString[i].equals("RandomizedSet"))
                randomizedSet = new RandomizedSet();
            else if (methodsString[i].equals("insert"))
                System.out.println(randomizedSet.insert(nums[i][0]));
            else if (methodsString[i].equals("remove"))
                System.out.println(randomizedSet.remove(nums[i][0]));
            else if (methodsString[i].equals("getRandom"))
                System.out.println(randomizedSet.getRandom());
        }
    }
}
class  RandomizedSet {
    ArrayList<Integer> numsArrs;
    HashMap<Integer, Integer> numsHash;
    public RandomizedSet() {
        numsArrs = new ArrayList<Integer>();
        numsHash = new HashMap<Integer, Integer>();
    }

    public boolean insert(int val) {
        boolean contain = numsHash.containsKey(val);
        if ( contain ) return false;
        numsHash.put( val, numsArrs.size());
        numsArrs.add(val);
        return true;
    }

    public boolean remove(int val) {
        boolean contain = numsHash.containsKey(val);
        if ( ! contain ) return false;
        int position = numsHash.get(val);
        if (position < numsArrs.size() - 1 ) {
            int lastOne = numsArrs.get(numsArrs.size() - 1 );
            numsArrs.set( position , lastOne );
            numsHash.put(lastOne, position);
        }
        numsHash.remove(val);
        numsArrs.remove(numsArrs.size() - 1);
        return true;
    }

    public int getRandom() {
        return numsArrs.get( new Random().nextInt(numsArrs.size()) );
    }
}

