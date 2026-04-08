package agoda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int start = i+1, end = nums.length-1;
            int sum = 0;
            while(start<end){
                sum = nums[i]+nums[start]+nums[end];
                System.out.println("sum inside while:: "+sum);
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    while(start<end && nums[start]==nums[start+1]) start++;
                    while(start<end && nums[end]==nums[end-1]) end--;
                    start++;
                    end--;
                }else{
                    if(sum>0){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
        }
        return result;
    }
}
