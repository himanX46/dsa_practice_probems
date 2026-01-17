package neetcode.tools;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<Integer> dequeue = new java.util.ArrayDeque<>();
        dequeue.addFirst(1);
        dequeue.addFirst(7);
        dequeue.addFirst(9);
        //9 7 1
        for(int i: dequeue){
            //System.out.println(dequeue.removeFirst());//9 7 1
            System.out.println(dequeue.removeLast());
        }
    }
}
