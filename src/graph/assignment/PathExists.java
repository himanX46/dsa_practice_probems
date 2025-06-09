package graph.assignment;

import java.util.ArrayList;
import java.util.List;

public class PathExists {
    public static void main(String[] args) {
        int A = 5;
        int[][] B = new int[][]{
                {1,2},
                {4,1},
                {2,4},
                {3,4},
                {5,2},
                {1,3}
        };
        System.out.println(findPathPresent(A,B));
    }

    private static int findPathPresent(int A,int[][] B){
        int n = B.length;
        int m = B[0].length;
        List<Integer> adjList = new ArrayList<>();
        
        return 0;
    }
}
