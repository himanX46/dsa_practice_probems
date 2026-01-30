package neetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class TOH {
    public static void main(String[] args) {
        System.out.println(tower_of_hanoi(3));
    }
    static ArrayList<ArrayList<Integer>> tower_of_hanoi(Integer n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(n,1,2,3,result);
        return result;
    }

    static void helper(int n, int src, int aux, int dest, ArrayList<ArrayList<Integer>> result){
        ArrayList<Integer> res = null;
        if(n==1){
            res = new ArrayList<>(Arrays.asList(src,dest));
            result.add(res);
            return;
        }
        helper(n-1,src,dest,aux,result);
        res = new ArrayList<>(Arrays.asList(src,dest));
        result.add(res);
        helper(n-1,aux,src,dest,result);
    }
}
