package graph;

import java.util.*;

public class DFS {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1,2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1, 4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));
        boolean[] visited = new boolean[adj.size()+1];
        //for(int i=0;i<adj.size();i++){
        dfs(0,adj,visited);
        //}
        for(int i=0;i<visited.length;i++){
            if(visited[i])
                System.out.println(i);
        }
    }

    private static void dfs(int i,List<List<Integer>> adj, boolean[] visited){
        visited[i] = true;
        for(int x : adj.get(i)){
            if(!visited[x]){
                dfs(x,adj,visited);
            }
        }
    }
}
