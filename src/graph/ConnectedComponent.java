package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedComponent {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = 6;
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(4).add(5);
        adj.get(5).add(4);
        //int components = countConnectedComponents(adj, n);
        //System.out.println("Number of connected components: " + components); // Output: 3
    }

    private static int findNoObj(List<List<Integer>> adj){
        int count = 0;
        for(List<Integer> d: adj){
            count += d.size();
        }
        return count;
    }

    private static void findCC(List<List<Integer>> adj,boolean[] visited,int i,int cc){
        visited[i] = true;
        for(int x : adj.get(i)){
            if(!visited[x]){
                findCC(adj,visited,x,cc);
                cc = cc+1;
            }
        }
    }
}
