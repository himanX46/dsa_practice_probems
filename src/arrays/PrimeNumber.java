package arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = {17,15,23,4};
        for(int n : numbers){
            System.out.println(n+":: "+isPrime(n));
        }
    }
    private static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return false;
        if(n%2==0) return false;
        for(int i=3;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
