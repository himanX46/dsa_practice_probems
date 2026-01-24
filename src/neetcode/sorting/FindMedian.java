package neetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
        ArrayList<Integer> stream = new ArrayList<>(Arrays.asList(3,8,5,2));
        ArrayList<Integer> res = online_median(stream);
        for (int i : res){
            System.out.print(i+", ");
        }
    }
    static ArrayList<Integer> online_median(ArrayList<Integer> stream) {
        // Write your code here.
        int n = stream.size();
        ArrayList<Integer> aux = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            aux.add(stream.get(i));
            int m = aux.size();
            if(m==1){
                res.add(aux.get(0));
            }else{
                if(m%2==0){
                    int mid = (m-1)/2;
                    int min = mid;
                    int max = mid+1;
                    int med = (int)Math.floor((aux.get(min)+aux.get(max))/2);
                    res.add(med);
                }else{
                    int mid = m/2;
                    int med = aux.get(mid);
                    res.add(med);
                }
            }
        }
        return res;
    }
}
