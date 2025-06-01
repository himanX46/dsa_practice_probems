package heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeap {
    public static void main(String[] args) {
        int[] stream = {3,1,5,12,2,11,4,8,9};
        int k = 3;

        Queue<Integer> res = findTopKElem(stream,k);
        for(int i=0;i<=res.size()+1;i++){
            System.out.println(res);
            System.out.println(res.poll());
        }
    }

    private static Queue<Integer> findTopKElem(int[] stream, int k){
        Queue<Integer> pq = new PriorityQueue<>(k);
        int len = stream.length;
        for(int i=0;i<len;i++){
            if(i<k){
                pq.add(stream[i]);
            }else{
                if(stream[i]>pq.peek()){
                    pq.poll();
                    pq.add(stream[i]);
                }
            }
        }
        return pq;
    }
}
