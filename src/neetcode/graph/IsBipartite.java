package neetcode.graph;

import java.util.Arrays;

import static java.lang.System.exit;

public class IsBipartite {
    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        boolean[] visited = new boolean[graph.length];
        int[] parent = new int[graph.length];
        int[] distance = new int[graph.length];
        Arrays.fill(parent,-1);
        Arrays.fill(distance,0);
        boolean result = true;
        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                if(!dfs(-1, i, graph, visited, parent, distance)){
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    static boolean dfs(int i, int node, int[][] graph, boolean[] visited, int[] parent, int[] distance){
        visited[node] = true;
        distance[node] = i==-1?0:distance[i]+1;
        parent[node] = i;
        for(int n : graph[node]){
            if(!visited[n]){
                if(!dfs(node,n,graph,visited,parent,distance)){
                    return false;
                }
            }else{
                if(parent[node]!=n && distance[node]%2 == distance[n]%2){
                    return false;
                }
            }
        }
        return true;
    }
}
