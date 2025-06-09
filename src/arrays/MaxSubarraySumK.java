package arrays;

//sliding window
public class MaxSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {-3,4,-2,5,3,-2,8,2,-1,4};
        int k = 5;
        System.out.println(findMaxSubarraySumK(arr,k));
    }
    private static int findMaxSubarraySumK(int[] arr,int k){
        int len = arr.length;
        int[] pSum  = new int[len];
        pSum[0] = arr[0];
        int maxSum = Integer.MIN_VALUE;
        for(int i=1;i<len;i++){
            pSum[i] = pSum[i-1]+arr[i];
        }
        for(int i=k-1;i<len;i++){
            if(i-k-1<0){
                continue;
            }
            int sum = pSum[i]-pSum[i-k-1];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
