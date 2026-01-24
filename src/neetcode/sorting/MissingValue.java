package neetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MissingValue {
    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<>(Arrays.asList(0L, 1L, 2L, 3L));
        System.out.println(find_integer(arr));
    }
    static Long find_integer(ArrayList<Long> arr) {
        // Write your code here.
        Collections.sort(arr);
        int size = arr.size();
        for(int i=0;i<size;i++){
            if(arr.get(i)!=Long.valueOf(i)){
                return Long.valueOf(i);
            }else{
                return Long.valueOf(size);
            }
        }
        return 0L;
    }
}
