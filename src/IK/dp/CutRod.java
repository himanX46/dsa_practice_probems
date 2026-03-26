package IK.dp;

public class CutRod {
    public static void main(String[] args) {
        int n=4;
        int[] cuts = {1,5,8,9};
        System.out.println(helper_dp(n,cuts));
    }
    static int helper(int n, int[] cuts){
        if(n==0){
            return 0;
        }
        int maxRev = 0;
        for(int i=0;i<=cuts.length;i++){
            int length = i+1;
            if(length<=n){
                maxRev = Math.max(maxRev,cuts[i]+helper(n-(i+1),cuts));
            }
        }
        return maxRev;
    }

    static int helper_dp(int n, int[] cuts){
        int[] dp = new int[n+1];
        for(int i=1;i<=n;i++){
            int maxRev = 0;
            for(int j=0;j<cuts.length;j++){
                if (cuts[j] <= i) {
                    maxRev = Math.max(maxRev, cuts[j] + dp[i - cuts[j]]);
                }
            }
            dp[i] = maxRev;
        }
        return dp[n];
    }
}
