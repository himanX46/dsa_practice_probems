package seventy5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeSortedLists {
    public static void main(String[] args) {
                List<Integer> l1 = List.of(1, 4, 7);
                List<Integer> l2 = List.of(2, 5, 8);
                List<Integer> l3 = List.of(3, 6, 9);

                List<List<Integer>> lists = List.of(l1, l2, l3);

                PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
                List<Integer> result = new ArrayList<>();

                // initialize heap
                for (int i = 0; i < lists.size(); i++) {
                    if (!lists.get(i).isEmpty()) {
                        pq.offer(new int[]{lists.get(i).get(0), i, 0}); // value, list index, element index
                    }
                }

                while (!pq.isEmpty()) {
                    int[] curr = pq.poll();
                    int val = curr[0];
                    int listIdx = curr[1];
                    int elemIdx = curr[2];

                    result.add(val);

                    if (elemIdx + 1 < lists.get(listIdx).size()) {
                        pq.offer(new int[]{
                                lists.get(listIdx).get(elemIdx + 1),
                                listIdx,
                                elemIdx + 1
                        });
                    }
                }

                System.out.println(result);
    }
}
