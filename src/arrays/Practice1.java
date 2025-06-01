package arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {-3,6,2,4,3,2,8,-9,3,1};
        int len = arr.length;
        int ans = 0;
        int[] preFix = new int[len];
        /*
        for(int i=0;i<len;i++){
            int sum = 0;
            for(int j=0;j<=i;j++){
                sum+=arr[j];
            }
            preFix[i]=sum;
        }
        */
        preFix[0] = arr[0];
        for(int i=1;i<len;i++){
            preFix[i] = preFix[i-1]+arr[i];
        }
        for (int fix : preFix) {
            System.out.print(fix+",");
        }
    }
}
