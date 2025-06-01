import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //String s1 = "Hello";
        //System.out.println(s1.substring(0,s1.length()-1));
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}