package neetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Meetings {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> intervals = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(13,56)),new ArrayList<>(Arrays.asList(1,3)),new ArrayList<>(Arrays.asList(4,5))
                ,new ArrayList<>(Arrays.asList(9990,10341)),new ArrayList<>(Arrays.asList(8,10)),new ArrayList<>(Arrays.asList(67,9990))));
        System.out.println(can_attend_all_meetings(intervals));
    }

    static Integer can_attend_all_meetings(ArrayList<ArrayList<Integer>> intervals) {
        // Write your code here.
        /*
        {
"intervals": [
[1, 5],
[5, 8],
[10, 15]
]
}

{
"intervals": [
[1, 5],
[4, 8]
]
}

{
"intervals": [
[13, 56],
[1, 3],
[4, 5],
[9990, 10341],
[8, 10],
[67, 9990]
]
}
         */
        int noOfMeetings = intervals.size();
        for(int i=0;i<noOfMeetings;i++){
            for(int j=i+1;j<noOfMeetings;j++){
                if(intervals.get(j).get(0)<intervals.get(i).get(1) && intervals.get(j).get(1)>intervals.get(i).get(0)){
                    return 0;
                }
            }
        }
        return 1;
    }
}
