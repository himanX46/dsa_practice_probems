package arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(findMaxSubarraySum(arr));
    }
    private static int findMaxSubarraySum(int[] arr){
        int res = 0;
        int len = arr.length;
        int[] prefixSum = new int[len];
        prefixSum[0] = arr[0];
        int maxSum = Integer.MIN_VALUE;
        for(int i=1;i<len;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        for(int i=len-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                int sum = prefixSum[i]-prefixSum[j];
                maxSum = Math.max(maxSum,sum);
            }

        }
        return maxSum;
    }
}
