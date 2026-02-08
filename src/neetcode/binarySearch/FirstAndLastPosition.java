package neetcode.binarySearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {};
        int target = 0;
        int[] result;
        int minIndex = binarySearch(nums,target);
        if(minIndex>=0 && minIndex<nums.length && nums[minIndex]!=target){
            result = new int[]{-1,-1};
        }else{
            int maxIndex = binarySearch(nums,target+1)-1;
            result = new int[]{minIndex,maxIndex};
        }
        for(int i : result){
            System.out.println(i);
        }
    }
    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int minIndex = nums.length;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]>=target){
                minIndex = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return minIndex;
    }
}
