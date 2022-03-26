package com.jyoti.day1;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] arr = new int[] {7,6,4,3,1};
        System.out.println(Integer.toString(maxProfit(arr)));
    }
    public int maxProfitOptimal(int[] prices) {
        int min = prices[0], profit = 0 ;
        if (prices.length == 1)
            return profit;
        for (int i = 1; i< prices.length; i++){
            if (min > prices[i])
                min = prices[i];
            profit = profit > (prices[i] - min) ? profit : (prices[i] - min);
        }
        return profit;
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++){
            for (int j = i+1 ; j< prices.length ; j++){
                max =  prices[j] - prices[i] > max ? prices[j] - prices[i] : max;
            }
        }
        return  max;
     }

}
