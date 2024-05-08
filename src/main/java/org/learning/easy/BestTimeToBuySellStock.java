package org.learning.easy;

public class BestTimeToBuySellStock {

    //121. Best Time to Buy and Sell Stock (only 1 trade allowed)
    // The idea is to buy low and sell high.
    //We have to find the max difference between selling price and buying price

    public int maxProfit(int[] prices)
    {
        //set profit to 0
        int profit=0;
        //set buying price as the first element of the given array
        int buyPrice = prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice > prices[i])
            {
                //Set current buy price is greater than prices[i]; set buy price to prices[i]
                buyPrice=prices[i];
            }

            //Set the profit as the maximum between current profit and profit we get after
            //making the sell
            profit=Math.max(profit,prices[i]-buyPrice);
        }
                return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuySellStock bestTimeToBuySellStock = new BestTimeToBuySellStock();
        System.out.println( bestTimeToBuySellStock.maxProfit(new int[]{7,1,5,3,6,4}));

    }
}
