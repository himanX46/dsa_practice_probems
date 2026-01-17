package neetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        System.out.println(insertion_sort(arr));
    }
    static ArrayList<Integer> insertion_sort(ArrayList<Integer> arr) {
        // Write your code here.
        int size = arr.size();
        for(int i=0;i<size;i++){
            int temp = arr.get(i);
            int m = i-1;
            while(m>=0 && arr.get(m)>temp){
                arr.set(m+1,arr.get(m));
                m--;
            }
            arr.set(m+1,temp);
        }
        return arr;
    }
}
