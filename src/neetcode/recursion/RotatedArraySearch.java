package neetcode.recursion;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3};
        int target = 2;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len-1;
        return helper(nums,left,right,target);
    }
    static int helper(int[] nums, int left, int right, int target){
        int mid = (left+right)/2;
        if(nums[mid] == target){
            System.out.println("Result received:: "+nums[mid]);
            return mid;
        }else if(nums[left]<nums[mid] && target<nums[mid]){
            return helper(nums,mid,right,target);
        }else if(nums[mid]<nums[right] && target>nums[mid]){
            return helper(nums,left,mid-1,target);
        }
        return -1;
    }
}
