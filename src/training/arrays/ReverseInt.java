package training.arrays;

public class ReverseInt {
    public static void main(String[] args) {
        int n = 123;
        StringBuilder res = new StringBuilder();
        while(n!=0){
            int rem = n%10;
            n = n/10;
            res.append(rem);
        }
        System.out.println(Integer.parseInt(res.toString()));
    }
}
