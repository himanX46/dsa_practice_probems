package dp;

import java.util.Arrays;

//find ways to go to a cell, only right and down movements, no cell with 1 is allowed
public class Practice3 {
    public static void main(String[] args) {
        int n=2,m=2;
        int A[][] = new int[][]{
                {0,0},{0,0},{0,0}
        };
        int[][] res = new int[n+1][m+1];
        fill(res,-1);
        System.out.println(findNoOfWays(A,n,m,res));
    }
    private static int findNoOfWays(int[][] A, int n, int m, int[][] res){
        if(n<0 || m<0) return 0;
        if(n==0 && m==0) return 1;
        if(n!=0 && m!=0 && A[n-1][m-1] == 1) return 0;
        if(res[n][m]!=-1){
            return res[n][m];
        }
        res[n][m] = findNoOfWays(A,n-1,m,res)+findNoOfWays(A,n,m-1,res);
        return res[n][m];
    }

    private static void fill(int[][] res, int val){
        for(int i=0;i<res.length;i++){
            Arrays.fill(res[i],val);
        }
    }
}
