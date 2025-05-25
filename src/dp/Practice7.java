package dp;
//LIS : brute force
public class Practice7 {
    public static void main(String[] args) {
        int[] A = new int[]{3, 10, 2, 1, 20};
        System.out.println(findLIS(A));
    }

    private static int findLIS(int[] A){
        int n = A.length;
        int ans = 1;
        int i=0;
        for(;i<n-1;i++){
            if(A[i+1]>A[i]){
                ans++;
            }
        }
        if(i<n-1 && A[i]<A[n-1]){
            ans++;
        }
        return ans;
    }
}
