package agoda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result = merge(intervals);
        for(int[] arr : result){
            System.out.println("["+arr[0]+","+arr[1]+"]");
        }
    }
    static List<int[]> merge(int[][] intervals){
        List<int[]> result = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(i>0 && !result.isEmpty() && end<= result.get(result.size()-1)[1]){
                continue;
            }
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]<=end){
                    end = Math.max(intervals[j][1],end);
                }else{
                    break;
                }
            }
            result.add(new int[]{start,end});
        }
        return result;
    }
}
