package neetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        //ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(8,5,3));
        System.out.println(merge_sort(arr));
    }
    static ArrayList<Integer> merge_sort(ArrayList<Integer> arr) {
        // Write your code here.
        int size = arr.size();
        int l = 0, r = size-1;
        ArrayList<Integer> aux = new ArrayList<>(size);
        helper(arr,l,r,aux);
        return arr;
    }

    static void helper(ArrayList<Integer> arr, int left, int right, ArrayList<Integer> aux){
        if(left>=right){
            return;
        }
        int mid = left+(right-left)/2;
        helper(arr,left,mid,aux);
        helper(arr,mid+1,right,aux);
        merge(arr, left, mid, right, aux);
    }

    static void merge(ArrayList<Integer> arr, int left, int mid, int right, ArrayList<Integer> aux){
        //merge
        int start = left, end = mid+1;
        while(start<=mid && end<=right){
            if(arr.get(start)<=arr.get(mid+1)){
                aux.add(arr.get(start));
                start++;
            }else{
                aux.add(arr.get(end));
                end++;
            }
        }
        while(start<=mid){
            aux.add(arr.get(start));
            start++;
        }
        while(mid<=end && end<=right){
            aux.add(arr.get(end));
            end++;
        }
        int size = arr.size();
        for(int i=0; i<size; i++){
            arr.set(i,aux.get(i));
        }
    }
}