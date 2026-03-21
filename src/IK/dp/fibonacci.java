package IK.dp;

public class fibonacci {
    public static void main(String[] args) {
        //0 1 1 2 3 5
        int n = 4;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        int[] fib = new int[n+2];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
}
