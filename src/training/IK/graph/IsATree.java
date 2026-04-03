package training.IK.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsATree {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> edge_start = new ArrayList<>(Arrays.asList(0,0,0));
        ArrayList<Integer> edge_end = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        ArrayList<Integer> edge1 = new ArrayList<>(Arrays.asList(edge_start.get(0),edge_end.get(0)));
        ArrayList<Integer> edge2 = new ArrayList<>(Arrays.asList(edge_start.get(1),edge_end.get(1)));
        ArrayList<Integer> edge3 = new ArrayList<>(Arrays.asList(edge_start.get(2),edge_end.get(2)));
        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        System.out.println(is_it_a_tree(n,edges));
    }

    static boolean is_it_a_tree(int n, ArrayList<ArrayList<Integer>> edges){
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge : edges){
            int u = edge.get(0);
            int v = edge.get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        int component = 0;
        for(int i=0;i<n;i++){
            if(component>1){
                return false;
            }
            if(!visited[i]){
                if(!bfs(i,adjList,result,visited,parent)){
                    return false;
                }
                component++;
            }
        }
        return true;
    }

    static boolean bfs(int i, ArrayList<ArrayList<Integer>> adjList, ArrayList<Integer> result, boolean[] visited, int[] parent){
        visited[i] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        while(queue.size()>0){
            int u = queue.poll();
            for(int v : adjList.get(u)){
                if(visited[v] && parent[u]!=v){
                    return false;
                }else if(!visited[v]){
                    visited[v] = true;
                    parent[v] = u;
                    queue.add(v);
                }
            }
        }
        return true;
    }
}
