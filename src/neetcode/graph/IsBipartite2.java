package neetcode.graph;

import java.util.Arrays;

public class IsBipartite2 {
    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        boolean[] visited = new boolean[graph.length];
        int[] parent = new int[graph.length];
        int[] distance = new int[graph.length];
        Arrays.fill(parent,-1);
        Arrays.fill(distance,0);
        boolean result = true;

    }
}
