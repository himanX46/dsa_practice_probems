package agoda;

public class MaxSubsrray {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(maxSubarraySum(arr));
    }

    static int maxSubarraySum(int[] arr){
        int maxCurr = 0;
        int maxSum = 0;
        for(int i=0;i<arr.length;i++){
            maxCurr = Math.max(arr[i],maxCurr+arr[i]);
            maxSum = Math.max(maxCurr,maxSum);
        }
        return maxSum;
    }
}
