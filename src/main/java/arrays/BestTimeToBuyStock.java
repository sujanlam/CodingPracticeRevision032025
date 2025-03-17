package arrays;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
        int[] prices1 = {7, 6, 4, 3, 1};
        int maxProfit1 = maxProfit(prices1);
        System.out.println(maxProfit1);
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            maxProfit = Math.max(prices[i] - buyPrice, maxProfit);
        }
        return maxProfit;
    }
}
