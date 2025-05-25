package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        List<List<Integer>> ansSubset = new ArrayList<>();
        printSubsets(arr,ansSubset);
        ansSubset.stream().forEach(elem->
                System.out.println(elem));
    }
    private static void printSubsets(int[] arr,List<List<Integer>> ansSubset){
        findRecursiveSubsets(arr,0,new ArrayList<>(),ansSubset);
    }

    private static void findRecursiveSubsets(int[] arr, int idx, List<Integer> currSubset, List<List<Integer>> ansSubset){
        ansSubset.add(new ArrayList<>(currSubset));
        System.out.println(ansSubset);
        if(idx==arr.length){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            currSubset.add(arr[i]);
            System.out.println(currSubset);
            findRecursiveSubsets(arr,i+1,currSubset,ansSubset);
            currSubset.remove(currSubset.size()-1);
        }
    }
}
