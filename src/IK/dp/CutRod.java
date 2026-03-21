package IK.dp;

public class CutRod {
    public static void main(String[] args) {
        int n=4;
        int[] cuts = {1,5,8,9};
        System.out.println(helper(n,cuts));
    }
    static int helper(int n, int[] cuts){
        int dp[] = new int[n+1];
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
}
