package dp;

import java.util.*;

//min sprinklers required
public class Practice9 {
    public static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1, 2, 2, -1, 0, 0};
        int n = 6;
        System.out.println(minSprinklers(arr,n));
    }

    private static int minSprinklers(int[] arr, int n){
        List<Pair> v = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] > -1){
                v.add(new Pair(i-arr[i],i+arr[i]));
            }
        }
        System.out.println("v:: "+v);
        Collections.sort(v,new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                return p1.x-p2.x;
            }
        });
        int maxRight = 0;
        int res = 0;
        int i=0;
        while(maxRight<n){

        }
        return 0;
    }
}
