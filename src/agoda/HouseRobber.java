package agoda;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] memo = new int[nums.length+1];
        Arrays.fill(memo,-1);
        //System.out.println(maxProfitDp(nums,nums.length-1, memo));
        System.out.println(maxProfitDpBottomUp(nums));
    }

    static int maxProfitDp(int[] nums, int i, int[] memo){
        if(i<0) return 0;
        if(i==0) return nums[i];
        if(memo[i]!=-1) return memo[i];
        return memo[i]=Math.max(maxProfitDp(nums,i-1,memo),(nums[i]+ maxProfitDp(nums,i-2,memo)));
    }

    static int maxProfitDpBottomUp(int[] nums){
        int n = nums.length;
        int[] dp = new int[nums.length+1];
        if(n==1){
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[n-1];
    }

}
