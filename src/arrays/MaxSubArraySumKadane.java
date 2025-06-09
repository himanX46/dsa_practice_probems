package arrays;

public class MaxSubArraySumKadane {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(printMaxSubSum(arr));
    }

    private static int printMaxSubSum(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int len = arr.length;
        for(int i=0;i<len;i++){
            currSum += arr[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum<-1){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
