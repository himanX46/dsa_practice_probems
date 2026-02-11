package dp;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sum = 4;
        //System.out.println(coinChangeRecur(coins,coins.length,sum));
        int[][] dp = new int[coins.length][sum+1];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println(coinChangeDp(coins,coins.length,sum,dp));
    }
    /*static int coinChangeRecur(int[] coins, int n, int sum){
        if(sum == 0){
            return 1;
        }
        if(sum<0 || n==0){
            return 0;
        }
        return coinChangeRecur(coins,n-1,sum)+coinChangeRecur(coins,n,sum-coins[n-1]);
    }*/
    static int coinChangeDp(int[] coins, int n, int sum, int[][] dp){
        if(sum == 0){
            return 1;
        }
        if(sum<0 || n==0){
            return 0;
        }
        if(dp[n-1][sum] != -1){
            return dp[n-1][sum];
        }
        dp[n-1][sum] = coinChangeDp(coins,n,sum-coins[n-1],dp)+coinChangeDp(coins,n-1,sum,dp);
        return dp[n-1][sum];
    }
}
