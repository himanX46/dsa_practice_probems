package neetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,5));
        int size = arr.size();
        int start =0;
        int end = size-1;
        while(start<end) {
            if (arr.get(start) % 2 == 0) {
                start++;
            } else {
                int temp = arr.get(start);
                if(arr.get(end)%2==0){
                    arr.set(start, arr.get(end));
                    arr.set(end,temp);
                    start++;
                    end--;
                }else{
                    while(arr.get(end)%2!=0 && start<end){
                        end--;
                    }
                }
            }
        }
        System.out.println(arr);
    }
}
