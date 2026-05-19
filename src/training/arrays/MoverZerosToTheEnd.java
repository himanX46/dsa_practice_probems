package training.arrays;

public class MoverZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,0,3,12};
        System.out.println(moveZeros(arr));
    }
    static int[] moveZeros(int[] nums) {
        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element into the correct position
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;
                insertPos++;
            }
        }
        return nums;
    }
}
