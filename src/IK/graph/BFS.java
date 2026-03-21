package IK.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        ArrayList<Integer> edge1 = new ArrayList<>(Arrays.asList(0,1));
        ArrayList<Integer> edge2 = new ArrayList<>(Arrays.asList(0,2));
        ArrayList<Integer> edge3 = new ArrayList<>(Arrays.asList(0,4));
        ArrayList<Integer> edge4 = new ArrayList<>(Arrays.asList(2,3));
        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);
        System.out.println(bfs_traversal(n,edges));
    }
    static ArrayList<Integer> bfs_traversal(int n, ArrayList<ArrayList<Integer>> edges){
        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] isVisited = new boolean[n];
        for(int i=0;i<n;i++){
            adj_list.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge : edges){
            int u = edge.get(0);
            int v = edge.get(1);
            adj_list.get(u).add(v);
            adj_list.get(v).add(u);
        }
        for(int i=0;i<n;i++){
            if(!isVisited[i]){
                bfs_traversalhelper(i,adj_list,result,isVisited);
            }
        }
        return result;
    }

    static void bfs_traversalhelper(int i,ArrayList<ArrayList<Integer>> adj_list,ArrayList<Integer> result,boolean[] isVisited){
        isVisited[i] = true;
        result.add(i);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        while(queue.size()>0){
            int u = queue.poll();
            for(int v : adj_list.get(u)){
                if(!isVisited[v]){
                    result.add(v);
                    queue.add(v);
                    isVisited[v] = true;
                }
            }
        }
    }
}
