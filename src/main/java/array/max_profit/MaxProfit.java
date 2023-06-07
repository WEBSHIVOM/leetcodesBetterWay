package src.main.java.array.max_profit;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int lowestPrice=Integer.MAX_VALUE;
        int overall_profit=0;
        int profit_if_sold_today=0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<lowestPrice){
                lowestPrice=prices[i];
            }
            profit_if_sold_today=prices[i]-lowestPrice;
            if(overall_profit<profit_if_sold_today){
                overall_profit=profit_if_sold_today;
            }
        }
        return overall_profit;
    }
}
