package com.jyoti.days2;

public class BestTimeToBuyAndSellStockNew {
    public static void main(String[] args){
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i< prices.length; i++){
            maxProfit = prices[i] > prices[i-1] ? maxProfit + prices[i] - prices[i-1] : maxProfit;
        }
        return maxProfit;
    }
}
