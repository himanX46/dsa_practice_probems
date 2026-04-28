package cortex;

public class RainTapping {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int left = 0;
        int right = height.length-1;
        int waterAcc = 0;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        while(left<=right){
            if(height[left]<height[right]){
                if(height[left]>leftMax){
                    leftMax = height[left];
                }else{
                    waterAcc += leftMax-height[left];
                }
                left++;
            }else{
                if(height[right]>rightMax){
                    rightMax = height[right];
                }else{
                    waterAcc += rightMax-height[right];
                }
                right--;
            }
        }
        System.out.println(waterAcc);
    }
}
