package neetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> slate = new ArrayList<>();
        int idx = 0;
        helper(candidates, slate, idx, target, result);
        System.out.println(result);
    }
    static void helper(int[] candidates, List<Integer> slate, int idx, int target, List<List<Integer>> result){
        if(idx == candidates.length){
            result.add(slate);
            return;
        }
        slate.add(candidates[idx]);
        helper(candidates,slate,idx+1,target-candidates[idx],result);
        slate.remove(slate.size()-1);
        helper(candidates,slate,idx+1,target-candidates[idx],result);
    }
}
