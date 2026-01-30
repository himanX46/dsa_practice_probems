package neetcode.recursion;

public class NoOfBst {
    public static void main(String[] args) {
        System.out.println(how_many_bsts(3));
    }
    static Long how_many_bsts(Integer n) {
        // Write your code here.
        long sum = 0l;
        if(n==0||n==1){
            return 1l;
        }
        for(int i=0;i<n;i++){
            sum += how_many_bsts(i)*how_many_bsts(n-1-i);
        }
        return sum;
    }
}
