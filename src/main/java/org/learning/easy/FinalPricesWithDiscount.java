package org.learning.easy;

public class FinalPricesWithDiscount {
    public int[] finalPrices(int[] prices) {
        int[] output = new int[prices.length];
        //Set the last elment of the new array with the last element of prices[]
        output[prices.length - 1] = prices[prices.length - 1];
        //Outer loop
        for (int i = 0; i < prices.length - 1; i++) {
            //Inner loop
            for (int j = i + 1; j < prices.length; j++) {
                boolean flag = true;
                //If any next element is lower, apply discount and set new array elment
                if (prices[j] <= prices[i]) {
                    output[i] = prices[i] - prices[j];
                    flag = false;
                    break;
                }
                //if no discount is available, then set same price
                output[i] = prices[i];
            }
        }
        return output;

    }

    public static void main(String[] args) {
        FinalPricesWithDiscount finalPrices = new FinalPricesWithDiscount();
        int[] arr = finalPrices.finalPrices(new int[]{8, 4, 6, 2, 3});
        for(int x:arr)
        {
            System.out.print(x);
        }
    }
}
