package cortex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        //[[1,4],[0,2],[3,5]]//[0,2],[1,4],[3,5]//[0,4],[3,5]
        //int[][] intervals = {{1,4},{0,2},{3,5}};
        merge(intervals);

    }
    public static int[][] merge(int[][] intervals) {
        //[[1,3],[2,6],[8,10],[15,18]]
        //[1,4],[0,2],[3,5] = [0,2],[1,4],[3,5] = [0,4],[3,5] = [0,5]
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> result = new ArrayList<>();
        int[] merged = new int[]{intervals[0][0],intervals[0][1]};
        for(int i=1;i<intervals.length;i++){
            if(merged[1] >= intervals[i][0]){
                merged[0] = Math.min(merged[0],intervals[i][0]);
                merged[1] = Math.max(merged[1],intervals[i][1]);
            }else{
                result.add(new ArrayList<>(Arrays.asList(merged[0],merged[1])));
                merged = new int[]{intervals[i][0],intervals[i][1]};
            }
        }
        result.add(new ArrayList<>(Arrays.asList(merged[0],merged[1])));
        System.out.println(result);
        int[][] resultArr = new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            resultArr[i][0] = result.get(i).get(0);
            resultArr[i][1] = result.get(i).get(1);
        }
        for(int i=0;i<resultArr.length;i++){
            System.out.print("["+resultArr[i][0]+","+resultArr[i][1]);
        }
        return resultArr;
    }
}
