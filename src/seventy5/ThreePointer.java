package seventy5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreePointer {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(Arrays.asList(1,4,5),Arrays.asList(1,3,4),Arrays.asList(2,6));
        int p1=0,p2=0,p3=0;
        List<Integer> result = new ArrayList<>();
        List<Integer> a1 = list.get(0);
        List<Integer> a2 = list.get(1);
        List<Integer> a3 = list.get(2);
        int size1 = list.get(0).size();
        int size2 = list.get(1).size();
        int size3 = list.get(2).size();
        while(p1<size1 || p2<size2 || p3<size3){
            int val1 = p1<size1?a1.get(p1) : Integer.MAX_VALUE;
            int val2 = p2<size2?a2.get(p2) : Integer.MAX_VALUE;
            int val3 = p3<size3?a3.get(p3) : Integer.MAX_VALUE;
            if(val1<=val2 && val1<=val3 && p1<size1){
                result.add(val1);
                p1++;
            }
            if(val2<=val3 && val2<=val1 && p2<size2){
                result.add(val2);
                p2++;
            }
            if(val3<=val1 && val3<=val2 && p3<size3){
                result.add(val3);
                p3++;
            }
        }
        System.out.println(result);
    }
}
