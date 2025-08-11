package dp;

import java.util.Arrays;
import java.util.OptionalInt;

public class LIS {
    public static void main(String[] args) {
        int[] arr = {10,22,9,33,21,50,41,60};
        int n = arr.length;
        System.out.println(lis(arr,n));
    }
    private static int lis(int[] arr, int n){
        int[] lis = new int[n];
        int max=0;
        Arrays.fill(lis,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] &&  lis[i]<lis[j]+1){
                    lis[i] = lis[j]+1;
                }
            }
        }
        return findMax(lis);
    }

    private static int findMax(int[] lis){
        OptionalInt n = Arrays.stream(lis).max();
        return n.getAsInt();
    }
}
