package agoda;

import java.util.Arrays;

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.println(climbStairsRecurs(n));
        //System.out.println(climbStairsDp(n,dp));
        System.out.println(climbStairsBottomUp(n,dp));
    }
    static int climbStairsRecurs(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return climbStairsRecurs(n-1)+climbStairsRecurs(n-2);
    }
    static int climbStairsDp(int n, int[] dp){
        if(n<=2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[n] = climbStairsDp(n-1,dp)+climbStairsDp(n-2,dp);
        return dp[n];
    }

    static int climbStairsBottomUp(int n, int[] dp){
        if(n==1) return 1;
        if(n==2) return 2;

        int prev2 = 1;
        int prev1 = 2;

        for(int i=3;i<dp.length;i++){
            int current = prev1+prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
