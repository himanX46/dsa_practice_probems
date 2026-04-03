package training.IK.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class NoOfConnectComponents {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        ArrayList<Integer> edge1 = new ArrayList<>(Arrays.asList(0,1));
        ArrayList<Integer> edge2 = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> edge3 = new ArrayList<>(Arrays.asList(0,2));
        ArrayList<Integer> edge4 = new ArrayList<>(Arrays.asList(3,4));
        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);
        System.out.println(number_of_connected_components(n,edges));
    }
    static Integer number_of_connected_components(Integer n, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int component = 0;
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge: edges){
            int u = edge.get(0);
            int v = edge.get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adjList,result,visited);
                component++;
            }
        }
        return component;
    }

    static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, ArrayList<Integer> result, boolean[] visited){
        visited[node] = true;
        result.add(node);
        for(int u: adjList.get(node)){
            if(!visited[u]) {
                dfs(u,adjList,result,visited);
            }
        }
    }

}
