package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] input = new int[]{-1,0,1,2,-1,-4};
        threeSum(input);
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        //if(nums[0]>0) return new ArrayList<>();
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(nums[i]>0) break;
            int low = i+1, high = nums.length-1;
            while(low<high && low!=i && high!=i && nums[i] != nums[i - 1]){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[low]);
                    lst.add(nums[high]);
                    if(!result.contains(lst)){
                        result.add(lst);
                        low++;
                        high--;
                        break;
                    }
                }else if(sum<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
