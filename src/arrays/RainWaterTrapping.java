package arrays;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 3, 1, 0, 4 };
        int len = arr.length;
        System.out.println(findMaxRainWater(arr,len));
    }

    private static int findMaxRainWater(int[] arr, int length){
        int[] leftMaxArr = findLeftMaxArr(arr,length);
        int[] rightMaxArr = findRightMaxArr(arr,length);
        int res = 0;
        for(int i=0;i<length;i++){
            res += Math.min(leftMaxArr[i],rightMaxArr[i])-arr[i];
        }
        return res;
    }

    private static int[] findLeftMaxArr(int[] arr, int len){
        int max = arr[0];
        int[] leftMaxArr = new int[len];
        for(int i=0;i<len;i++){
            max = Math.max(max,arr[i]);
            leftMaxArr[i] = max;
        }
        return leftMaxArr;
    }

    private static int[] findRightMaxArr(int[] arr, int len){
        int max = arr[len-1];
        int[] rightMaxArr = new int[len];
        for(int i=len-1;i>=0;i--){
            max = Math.max(max,arr[i]);
            rightMaxArr[i] = max;
        }
        return rightMaxArr;
    }
}
