package com.jyoti.days7;

public class MaximumPointsYouCanObtainFomCards {
    public static void main(String[] args){
        int[] arr = new int[]{9,7,7,9,7,7,9};
        System.out.println(maxScore(arr,6));
    }
    public static int maxScoreWithOutExtraSpace(int[] cardPoints, int k) {
        int totalSum  = 0, max = 0;
        for (int i = 0; i<cardPoints.length;i++)
            totalSum+=cardPoints[i];


        for (int i = k-1; i>=-1; i--){
            int subArraySum = 0;
            for (int j=i+1;j<cardPoints.length - (k - (i+1)); j++){
                subArraySum += cardPoints[j];
            }
            System.out.println(i+"-"+subArraySum);
            max = Math.max(max,totalSum-subArraySum);
        }
        return  max;
    }
    public static int maxScore(int[] cardPoints, int k) {
        int[] sumArray = new int[cardPoints.length];
        int totalSum = 0,score = 0,ans = 0;
        for (int i =0; i<cardPoints.length;i++){
            totalSum += cardPoints[i];
            sumArray[i] = totalSum;
        }
        if (cardPoints.length == k )
            return  totalSum;

        for (int i = 0; i<=k; i++){
            int j = i+cardPoints.length - k -1;
            if ( i == 0 ) ans = sumArray[j];
            else ans = sumArray[j] - sumArray[i-1];
            score = Math.max(score,totalSum - ans);
        }
        return score;
    }
}
