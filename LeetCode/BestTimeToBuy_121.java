import java.util.*;
class BestTimeToBuy_121 {
    public int maxProfit(int[] prices) {
        // we need to find the longest peek following smallest valley
        // find valley and it's index
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int []prices = new int[n];
        for (int i= 0; i < n; i++)
            prices[i] = kb.nextInt();
        int ans = maxProfit(prices);
        System.out.println(ans);
    }   
    
}