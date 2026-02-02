
package com.barray.intermidiate;

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] stockPrices = {7, 8, 9, 5, 4, 6};
        int result = maxProfit(stockPrices);
        System.out.println("Mazimum profit : "+result);

    }
}
