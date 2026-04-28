package priority;

import java.util.ArrayList;
import java.util.List;

public class MaxElementWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        findMax2(arr,k);
    }
    static void findMax2(int[] arr, int k){
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int j=i;
            int counter = 0;
            int max = arr[i];
            while(counter<k && j+k<=arr.length){
                max = Math.max(max,arr[j]);
                j++;
                counter++;
            }
            result.add(max);
        }
        System.out.println(result);
    }
    static void findMax(int[] arr, int k){
        int noOfWindows = arr.length - k + 1;
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < noOfWindows; i++) {
            int max = arr[i];
            int j = i;
            int counter = 0;
            while (counter < k) {
                max = Math.max(max, arr[j]);
                j++;
                counter++;
            }
            results.add(max);
        }
        System.out.println(results);
    }
}
