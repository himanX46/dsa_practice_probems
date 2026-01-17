package neetcode.sorting;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

public class Coins {
    public static void main(String[] args) {
        int[] piles = new int[]{9,8,7,6,5,1,2,3,4};
        //System.out.println(maxCoins(piles));
        System.out.println(maxCoins2(piles));
    }

    public static int maxCoins2(int[] piles){
        Arrays.sort(piles);
        ArrayDeque<Integer> dequeue = new ArrayDeque<>();
        for(int num: piles){
            dequeue.addLast(num);
        }
        int maxVal = 0;
        while(!dequeue.isEmpty()){
            System.out.println(dequeue.removeLast());//Alice
            maxVal += dequeue.removeLast();//Us
            System.out.println(dequeue.removeFirst());//Bob
        }
        return maxVal;
    }

    public static int maxCoins(int[] piles) {
        piles = reverse(piles);
        int len = piles.length;
        int maxVal = 0;
        //piles = [9,8,7,6,5,1,2,3,4]
        //piles = [9,8,7,6,5,4,3,2,1]
        //
        int count = 0;
        int i=1;
        while(count<len/3){
            maxVal = maxVal + piles[i];
            i += 2;
            count++;
        }
        return maxVal;
    }

    public static int[] reverse(int[] piles) {
        Arrays.sort(piles); // arr is now {1, 2, 5, 8, 9}

        // Reverse the sorted array in-place
        for (int i = 0; i < piles.length / 2; i++) {
            int temp = piles[i];
            piles[i] = piles[piles.length - 1 - i];
            piles[piles.length - 1 - i] = temp;
        }
        return piles;
    }
}
