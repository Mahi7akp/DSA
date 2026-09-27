package arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i=1; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, (prices[i]-minPrice));
        }
        return maxProfit;
    }

    public static  void main (String[] args){
        int [] prices = {7,1,5,6,4,2};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
