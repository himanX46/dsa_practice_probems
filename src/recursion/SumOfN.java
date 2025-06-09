package recursion;

public class SumOfN {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findSum(n));
    }

    private static int findSum(int n){
        if(n==1){
            return n;
        }else{
            return n+findSum(n-1);
        }
    }
}
