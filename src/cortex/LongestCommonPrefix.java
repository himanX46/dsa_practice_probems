package cortex;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        System.out.println(findLCP(arr));
    }
    static String findLCP(String[] arr){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int minLength = Integer.MAX_VALUE;
        StringBuilder result = new StringBuilder();
        for(String s : arr){
            minLength = Math.min(minLength,s.length());
        }
        String startString = arr[start];
        String endString = arr[end];
        for(int i=0;i<minLength;i++){
            if(startString.charAt(i)!=endString.charAt(i)){
                break;
            }else{
                result.append(startString.charAt(i));
            }
        }
        return result.toString();
    }
}
