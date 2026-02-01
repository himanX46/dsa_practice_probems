package neetcode.recursion;

import java.util.List;
import java.util.ArrayList;

public class GeneratePermutations {
    public static void main(String[] args) {
        //ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int idx = 0;
        helper(nums,idx,result);
        return result;
    }

    static void helper(int[] arr, int idx, List<List<Integer>> result){
        if(idx == arr.length){
            List<Integer> arrList = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                arrList.add(arr[i]);
            }
            result.add(arrList);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,idx,i);
            helper(arr,idx+1,result);
            swap(arr,idx,i);
        }
    }

    static void swap(int[] arr, int idx, int i){
        int tmp = arr[idx];
        arr[idx]=arr[i];
        arr[i]=tmp;
    }
}
