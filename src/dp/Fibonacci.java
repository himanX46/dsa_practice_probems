package dp;

import java.util.Arrays;

//0,1,1,2,3,5,8,13,21
public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        int ans[] = new int[n+1];
        Arrays.fill(ans,-1);
        System.out.println(findFibonacci(n,ans));
    }

    private static int findFibonacci(int n,int[] ans){
        if(n<=2) {
            return n - 1;
        }
        if(ans[n]!=-1){
            return ans[n];
        }
        ans[n] = findFibonacci(n-1,ans)+findFibonacci(n-2,ans);
        return ans[n];
    }
}
