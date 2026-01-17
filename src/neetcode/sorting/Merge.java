package neetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 8, 3, 9, 4, 1, 7));
        helper(arr,0,arr.size()-1);
        System.out.println(arr);
    }
    static void helper(ArrayList<Integer> arr, int start, int end){
        if(start == end){
            return;
        }
        int mid = (start+end)/2;
        helper(arr, start, mid);
        helper(arr, mid+1, end);
        int left = start;
        int right = mid+1;
        ArrayList<Integer> aux = new ArrayList<>();
        while(left<=mid && right<=end){
            if(arr.get(left)<=arr.get(right)){
                aux.add(arr.get(left));
                left++;
            }
            if(arr.get(right)<arr.get(left)){
                aux.add(arr.get(right));
                right++;
            }
        }
        while(left<=mid){
            aux.add(arr.get(left));
            left++;
        }
        while(right<=end){
            aux.add(arr.get(right));
            right++;
        }
        for(int i=0;i<aux.size();i++){
            arr.set(i,aux.get(i));
        }
    }
}
