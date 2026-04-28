package agoda;

public class Cycle {
    //Number of Child in the Circle
    public static void main(String[] args) {
        System.out.println(numberOfChild(3,5));
    }
    public static int numberOfChild(int n, int k) {
        int cycle = 2 * (n - 1);
        int pos = k % cycle;

        if (pos < n) {
            return pos;
        } else {
            return cycle - pos;
        }
    }
}
