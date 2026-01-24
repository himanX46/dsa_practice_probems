package neetcode.sorting;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class IntersectedElement {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> find_intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3) {
        // Write your code here.
        int size1 = arr1.size();
        int size2 = arr2.size();
        int size3 = arr3.size();
        TreeMap<Integer,Integer> hmap = new TreeMap<>();
        for(int i=0;i<size1;i++){
            if(hmap.containsKey(arr1.get(i))){
                hmap.put(arr1.get(i),hmap.get(arr1.get(i))+1);
            }else{
                hmap.put(arr1.get(i),1);
            }
        }
        for(int i=0;i<size2;i++){
            if(hmap.containsKey(arr2.get(i))){
                hmap.put(arr2.get(i),hmap.get(arr2.get(i))+1);
            }else{
                hmap.put(arr2.get(i),1);
            }
        }
        for(int i=0;i<size3;i++){
            if(hmap.containsKey(arr3.get(i))){
                hmap.put(arr3.get(i),hmap.get(arr3.get(i))+1);
            }else{
                hmap.put(arr3.get(i),1);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            if(entry.getValue()>2){
                res.add(entry.getKey());
            }
        }
        return res;
    }

}
