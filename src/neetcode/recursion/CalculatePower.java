package neetcode.recursion;

public class CalculatePower {
    public static void main(String[] args) {
        System.out.println(calculate_power(2l,10l));
    }
    static Integer calculate_power(Long a, Long b) {
        // Write your code here.
        //return (int)(Math.pow(a,b)%1000000007);
        Long ans = 1L;
        ans = helper(a,b,ans);
        System.out.println("ans is :: "+ans);
        return Math.round(ans%1000000007);
    }

    static Long helper(Long a, Long b, Long ans){
        if(a==1l || b==0l){
            return ans;
        }
        ans *= a;
        b--;
        return helper(a,b,ans);
    }
}
