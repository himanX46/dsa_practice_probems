package neetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSubsets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> slate = new ArrayList<>();
        int idx = 0;
        helper(nums,idx,slate,result);
        return result;
    }
    public static void helper(int[] nums, int idx, List<Integer> slate, List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(slate));
            return;
        }
        helper(nums,idx+1,slate,result);
        slate.add(nums[idx]);
        helper(nums,idx+1,slate,result);
        slate.remove(slate.size()-1);
    }
}
