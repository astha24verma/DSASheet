package Day1;

public class D1006BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        //Output - 5 (6 - 1 = 5)
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        // DP
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 1; i < prices.length; i++){
            int cost = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, cost);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;

        // int max = 0;
        // int buy = prices[0];
        // for(int i = 0 ; i < prices.length; i++){
        //     if(buy > prices[i]){
        //         buy = prices[i];
        //     }else if(prices[i] - buy > max){
        //         max = prices[i] - buy;
        //     }
        // }
        // return max;
    }
}
