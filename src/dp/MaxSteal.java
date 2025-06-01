package dp;

import java.util.Arrays;
//find max steal with alternate houses
public class MaxSteal {
    public static void main(String[] args) {
        int A[] = new int[]{2,7,8,10};
        int len = A.length;
        int[] ans = new int[len];
        Arrays.fill(ans,-1);
        System.out.println(ans);
        System.out.println(findMaxSteal(A,len-1,ans));
    }
    private static int findMaxSteal(int[] A, int i, int[] ans){
        if(i<0){
            return 0;
        }
        if(ans[i] != -1){
            return ans[i];
        }
        ans[i] = Math.max(A[i]+findMaxSteal(A,i-2,ans),findMaxSteal(A,i-1,ans));
        return ans[i];
    }
}
