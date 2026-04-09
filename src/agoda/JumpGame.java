package agoda;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(jumpGameFun(nums));
    }

    static boolean jumpGameFun(int[] nums){
        int maxJump = 0;
        for(int i=0;i< nums.length;i++){
            int jump = nums[i]+i;
            if(i>maxJump){
                return false;
            }
            maxJump = Math.max(maxJump,jump);
        }
        return true;
    }
}
