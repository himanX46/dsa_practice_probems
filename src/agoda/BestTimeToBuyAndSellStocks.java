package agoda;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices= {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit1Pass(prices));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit = prices[j]-prices[i];
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }

    public static int maxProfit1Pass(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                maxProfit = Math.max(maxProfit,prices[i]-minPrice);
            }
        }
        return maxProfit;
    }
}
