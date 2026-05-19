package cortex;

import java.util.Arrays;

public class MoveZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,0};
        sortArrOptimized(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }

    static void sortArrOptimized(int[] arr){
        int low = 0, mid = 0;
        int high = arr.length-1;
        while(mid<high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                swap(arr,high,mid);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArr(int[] arr){
        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZeros++;
            }
            if(arr[i]==1){
                countOnes++;
            }
            if(arr[i]==2){
                countTwos++;
            }
        }
        int i=0;
        while(countZeros!=0){
            arr[i] = 0;
            countZeros--;
            i++;
        }
        while(countOnes!=0){
            arr[i] = 1;
            countOnes--;
            i++;
        }
        while(countTwos!=0){
            arr[i] = 2;
            countTwos--;
            i++;
        }
    }
}
