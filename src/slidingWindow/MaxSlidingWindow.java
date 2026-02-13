package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int noOfWindows = nums.length-k+1;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<noOfWindows;i++){
            int end = i+k;
            int maxNum = nums[i];
            for(int j=i+1;j<end;j++){
                maxNum = Math.max(maxNum,nums[j]);
            }
            result.add(maxNum);
        }
        System.out.println(result);
    }
}
