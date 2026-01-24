package neetcode.sorting;

import java.util.*;

public class KFrequent {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 1));
        int k = 2;
        find_top_k_frequent_elements(arr,k);
    }
    static ArrayList<Integer> find_top_k_frequent_elements(ArrayList<Integer> arr, Integer k) {
        // Write your code here.
        Map<Integer,Integer> hmap = new HashMap<>();
        int size = arr.size();
        for(int i=0;i<size;i++){
            if(hmap.containsKey(arr.get(i))){
                hmap.put(arr.get(i),hmap.get(arr.get(i))+1);
            }else{
                hmap.put(arr.get(i),1);
            }
        }
        int maxVal = 0;
        int maxKey = 0;
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            if(entry.getValue()>maxVal){
                maxKey = entry.getKey();
                maxVal = entry.getValue();
            }
        }
        int secMaxVal = 0;
        int secMaxKey = 0;
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            if(entry.getValue()>=secMaxVal && secMaxVal<=maxVal){
                secMaxKey = entry.getKey();
                secMaxVal = entry.getValue();
            }
        }
        return new ArrayList(Arrays.asList(maxKey,secMaxKey));
    }
}
