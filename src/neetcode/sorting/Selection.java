package neetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Selection {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        System.out.println(selection_sort(arr));
    }
    public static ArrayList<Integer> selection_sort(ArrayList<Integer> arr) {
        // Write your code here.
        int size = arr.size();
        int minVal = arr.get(0);
        int minIndex = 0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr.get(j)>arr.get(i)){
                    minVal = arr.get(i);
                    minIndex = i;
                }else{
                    minVal = arr.get(j);
                    minIndex = j;
                    swap(i,j,arr);
                }
            }
        }
        return arr;
    }

    public static void swap(int i, int j, ArrayList<Integer> arr){
        int c = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,c);
    }
}
