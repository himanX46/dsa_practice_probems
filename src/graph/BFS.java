package graph;

import java.sql.Array;
import java.util.*;

public class BFS {
    public static void main(String[] args) {
        //int[][] adj = {{1,2},{0,2,3},{0,1,4},{1,4},{2,3}};
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1,2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1, 4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));
        boolean[] visited = new boolean[adj.size()+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int p = queue.poll();
            visited[p]=true;
            for(int x: adj.get(p)){
                if(!visited[x]){
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]){
                System.out.println(i);
            }
        }
    }
}
