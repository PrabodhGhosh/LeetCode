package org.learning.easy;

public class BestTimeToBuySellStock2 {
    //122. Best Time to Buy and Sell Stock II
    //In this program we are allowed to buy and sell more than once and maximize our profit

    public int maxProfit(int[] prices) {
        //set profit to zero
        int profit = 0;
        //set buy price to first element of the array
        int buyPrice = prices[0];

        //start the loop
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                //If buy price is less than current array element, accumulate profit
                profit += prices[i] - buyPrice;
            }
            buyPrice=prices[i];
        }
       return profit;
    }
    public static void main(String[] args) {
        BestTimeToBuySellStock2 bestTimeToBuySellStock2 = new BestTimeToBuySellStock2();
        System.out.println( bestTimeToBuySellStock2.maxProfit(new int[]{7,1,5,3,6,4}));

    }
}
