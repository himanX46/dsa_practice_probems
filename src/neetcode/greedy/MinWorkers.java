package neetcode.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinWorkers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0};
        List<List<Integer>> intervals = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List<Integer> lst = new ArrayList<>();
            lst.add(i-arr[i]);
            lst.add(i+arr[i]);
            intervals.add(lst);
        }
        for(int i=0;i<intervals.size();i++){
            if(intervals.get(i).get(0)<0){
                intervals.get(i).set(0,0);
            }
        }
        intervals.sort(Comparator.comparingInt(a->a.get(0)));
        System.out.println(intervals);
        int men = 0, max = -1;
        List<List<Integer>> finalLst = new ArrayList<>();
        for(int i=0;i<intervals.size();i++){
            if(intervals.get(i).get(0) >= 0){
                finalLst.add(intervals.get(i));
            }
        }
        System.out.println(finalLst);
        for(int i=0;i<finalLst.size();i++){

        }
    }
}
