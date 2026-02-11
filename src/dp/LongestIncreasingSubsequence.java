package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3};
        System.out.println(findLIS(arr));
    }
    static int findLIS(int[] arr){
        int maxCount = Integer.MIN_VALUE;
        int[] lis = new int[arr.length];
        Arrays.fill(lis,1);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && lis[i]<lis[j]+1){
                    lis[i] = lis[j]+1;
                }
            }
        }
        return findMax(lis);
    }

    static int findMax(int[] lis){
        return Arrays.stream(lis).max().getAsInt();
    }
}
