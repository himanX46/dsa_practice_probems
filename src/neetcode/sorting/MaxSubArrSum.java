package neetcode.sorting;

public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = new int[]{8819, 674, 8816, 7705, 5699, 5383, 6177, 2113, 1992};
        int k = 1;
        System.out.println(maxSubarraySum(arr,k));
    }
    public static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int len = arr.length;
        int maxSum = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
            maxSum = Math.max(sum,maxSum);
        }
        for(int i=k;i<len;i++){
            sum = sum-arr[i-k]+arr[i];
            maxSum = Math.max(sum,maxSum);
        }
        maxSum = Math.max(sum,maxSum);
        return maxSum;
    }
}
