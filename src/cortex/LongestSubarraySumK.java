package cortex;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        //int[] arr = {9,-3,3,-1,6,-5};
        int[] arr = {6,-2,2,-8,1,7,4,-10};
        int n = 6;
        int k = 0;
        //System.out.println(longestSubarr(arr,k));
        System.out.println(longestSubArrK(arr,k));
    }
    static int longestSubarr(int[] arr, int k){
        int maxLen = 0;
        for(int i=0;i<arr.length;i++){
            int sum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+= arr[j];
                if(sum==k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    static int longestSubArrK(int[] arr, int k){
        int maxLen = 0;
        Map<Integer,Integer> hMap = new HashMap<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == k){
                maxLen = i+1;
            }else{
                if(hMap.containsKey(sum)){
                    maxLen = Math.max(maxLen,i-hMap.get(sum));
                }else{
                    hMap.put(sum,i);
                }
            }
        }
        return maxLen;
    }
}
