package neetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1,0,0,0)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1,0,0,0)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,0,1,0,0)));
        System.out.println(findShortestPath(matrix));
    }

    static int findShortestPath(ArrayList<ArrayList<Integer>> matrix){
        int m = matrix.size();
        int n = matrix.get(0).size();
        if(matrix.get(0).get(0)==1 || matrix.get(m-1).get(n-1)==1){
            return -1;
        }
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        queue.add(new int[]{0,0,1});
        visited[0][0]=true;
        int[][] dir = {
                {-1,0},{1,0},{0,-1},{0,1},
                {-1,-1},{-1,1},{1,-1},{1,1}
        };
        while(queue.size()>0){
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int dist = curr[2];
            if(x==m-1 && y==n-1){
                return dist;
            }
            for(int[] d: dir){
                int nx = x+d[0];
                int ny = y+d[1];
                if(nx>=0 && ny>=0 && nx<m && ny<n && matrix.get(nx).get(ny)==0 && !visited[nx][ny]){
                    visited[nx][ny]=true;
                    queue.add(new int[]{nx,ny,dist+1});
                }
            }
        }
        return -1;
    }
}
