package neetcode.binarySearch;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int left = 0;
        int right = nums.length-1;
        System.out.println(binarySearch(nums,target,left,right));
    }
    static int binarySearch(int[] nums, int target, int left, int right){
        int mid = left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]<target){
            return binarySearch(nums,target,mid+1,right);
        }else{
            return binarySearch(nums,target,left,mid-1);
        }
    }
}
