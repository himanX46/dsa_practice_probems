package dp;

import java.util.Arrays;
//LCS dp
public class Practice5 {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int n = s1.length();
        int m = s2.length();
        int[][] ans = new int[n+1][m+1];
        fill(ans);
        System.out.println(findLCS(s1,s2,n-1,m-1,ans));
    }
    private static int findLCS(String s1, String s2, int n, int m, int[][] ans){
        if(n<0 || m<0){
            return 0;
        }
        if(ans[n][m]!=-1){
            return ans[n][m];
        }

        if(s1.charAt(n) == s2.charAt(m)){
            ans[n][m] = 1+findLCS(s1,s2,n-1,m-1,ans);
        }else{
            ans[n][m] = Math.max(findLCS(s1,s2,n-1,m,ans),findLCS(s1,s2,n,m-1,ans));
        }
        return ans[n][m];
    }

    private static void fill(int[][] ans){
        for(int i=0;i<ans.length;i++){
            Arrays.fill(ans[i],-1);
        }
    }
}
