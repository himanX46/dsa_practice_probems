package recursion;
//0,1,1,2,3,5,8,13,21,34
public class Practice1 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(findFibonacci(n));
    }

    private static int findFibonacci(int n){
        if(n<=2){
            return n-1;
        }
        return findFibonacci(n-1)+findFibonacci(n-2);
    }
}
