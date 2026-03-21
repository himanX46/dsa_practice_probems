package IK.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        ArrayList<Integer> edge1 = new ArrayList<>(Arrays.asList(0,1));
        ArrayList<Integer> edge2 = new ArrayList<>(Arrays.asList(0,2));
        ArrayList<Integer> edge3 = new ArrayList<>(Arrays.asList(1,4));
        ArrayList<Integer> edge4 = new ArrayList<>(Arrays.asList(3,5));
        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);
        System.out.println(dfs_traversal(n,edges));
    }

    static List<Integer> dfs_traversal(int n, ArrayList<ArrayList<Integer>> edges){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge : edges){
            int u = edge.get(0);
            int v = edge.get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adjList,result,visited);
            }
        }
        return result;
    }

    static void dfs(int i, ArrayList<ArrayList<Integer>> adjList, ArrayList<Integer> result, boolean[] visited){
        visited[i] = true;
        result.add(i);
        for(int u: adjList.get(i)){
            if(!visited[u]){
                dfs(u,adjList,result,visited);
            }
        }
    }
}
