package greedy;

public class Practice1 {
    public static void main(String[] args) {
        int[] A = new int[]{1,5,2,1};
        System.out.println(candy(A));
    }
    public static int candy(int[] A) {
        int len = A.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 1;
        for(int i=1;i<len;i++){
            if(A[i]>A[i-1]){
                left[i]=A[i-1]+1;
            }else{
                left[i]=1;
            }
        }
        right[len-1] = 1;
        for(int i=len-2;i>=0;i--){
            if(A[i]>A[i+1]){
                right[i]=A[i+1]+1;
            }else{
                right[i]=1;
            }
        }
        int[] ans = new int[len];
        for(int i=0;i<len;i++){
            ans[i] = Math.max(left[i],right[i]);
        }
        int count = 0;
        for(int i=0;i<len;i++){
            count += ans[i];
        }
        return count;
    }
}
