package neetcode.sorting;

import java.util.*;

public class EucledeanDistance {
    public static void main(String[] args) {
        Integer p_x=1,p_y=1,k=2;
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,0));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(2,1));
        ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(0,1));
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        nearest_neighbours(p_x,p_y,k,arr);
    }
    static ArrayList<ArrayList<Integer>> nearest_neighbours(Integer p_x, Integer p_y, Integer k, ArrayList<ArrayList<Integer>> n_points) {
        // Write your code here.
        int size = n_points.size();
        double min_dist = 0d;
        ArrayList<ArrayList<Integer>> resList = new ArrayList<>();
        Map<ArrayList<Integer>,Double> resMap = new HashMap<>();
        for(int i=0;i<size;i++){
            ArrayList<Integer> tmp = n_points.get(i);
            double dist = Math.sqrt((p_x-tmp.get(0))*(p_x-tmp.get(0))+(p_y-tmp.get(1))*(p_y-tmp.get(1)));
            resMap.put(tmp,dist);
        }
        int count=0;
        for(Map.Entry<ArrayList<Integer>,Double> entry : resMap.entrySet()){
            if(count==k){
                break;
            }
            resList.add(entry.getKey());
            count++;
        }
        return resList;
    }
}
